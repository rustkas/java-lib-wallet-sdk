package com.paysera.sdk.wallet;

import bolts.Continuation;
import bolts.Task;
import bolts.TaskCompletionSource;
import com.paysera.sdk.wallet.clients.OAuthAsyncClient;
import com.paysera.sdk.wallet.entities.Credentials;
import com.paysera.sdk.wallet.exceptions.WalletApiException;
import com.paysera.sdk.wallet.interfaces.AccessTokenRefresherDelegate;
import java.util.Date;
import java.util.List;

public class AccessTokenRefresher {
    private OAuthAsyncClient oAuthAsyncClient;
    private AccessTokenRefresherDelegate accessTokenRefresherDelegate;
    private Credentials credentials;
    private Task<Credentials> accessTokenRefreshTask;
    private Date accessTokenRefreshedAt;

    public AccessTokenRefresher(
        OAuthAsyncClient oAuthAsyncClient,
        AccessTokenRefresherDelegate accessTokenRefresherDelegate,
        Credentials credentials
    ) {
        this.oAuthAsyncClient = oAuthAsyncClient;
        this.accessTokenRefresherDelegate = accessTokenRefresherDelegate;
        this.credentials = credentials;
    }

    public synchronized boolean isAccessTokenRefreshing() {
        return accessTokenRefreshTask != null;
    }

    public synchronized Task<Credentials> refreshAccessToken() {
        return this.refreshAccessToken(null, null);
    }

    public synchronized Task<Credentials> refreshAccessToken(final List<String> scopes, final String code) {
        if (accessTokenRefreshTask != null) {
            return accessTokenRefreshTask;
        }

        final TaskCompletionSource<Credentials> taskCompletionSource = new TaskCompletionSource<Credentials>();
        final Task<Credentials> accessTokenRefreshTask = taskCompletionSource.getTask();
        this.accessTokenRefreshTask = accessTokenRefreshTask;

        this.oAuthAsyncClient
            .refreshToken(this.credentials.getRefreshToken(), scopes, code)
            .continueWith(new Continuation<Credentials, Void>() {
                @Override
                public Void then(Task<Credentials> task) throws Exception {
                    synchronized (AccessTokenRefresher.this) {
                        AccessTokenRefresher.this.accessTokenRefreshTask = null;

                        if (!task.isFaulted()) {
                            Credentials renewedCredentials = task.getResult();
                            credentials.update(renewedCredentials);

                            accessTokenRefreshedAt = new Date();
                            accessTokenRefresherDelegate.onAccessTokenRefreshed(renewedCredentials, null);

                            taskCompletionSource.setResult(task.getResult());
                            return null;
                        }

                        WalletApiException walletApiException = (WalletApiException) task.getError();

                        if (
                               walletApiException.getStatusCode() != null
                            && walletApiException.isInvalidGrantError()
                            ) {
                            accessTokenRefresherDelegate.onRefreshTokenInvalid();
                        }

                        taskCompletionSource.setError(task.getError());

                        return null;
                    }
                }
            });

        return accessTokenRefreshTask;
    }

    public boolean hasAccessTokenBeenRecentlyRefreshed() {
        return accessTokenRefreshedAt != null
            && accessTokenRefreshedAt.after(new Date(System.currentTimeMillis() - 20000));
    }

    public boolean willAccessTokenExpireSoon() {
        return credentials.getValidUntil().before(new Date(System.currentTimeMillis() - 30000));
    }
}