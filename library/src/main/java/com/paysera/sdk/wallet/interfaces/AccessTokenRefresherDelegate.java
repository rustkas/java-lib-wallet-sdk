package com.paysera.sdk.wallet.interfaces;

import com.paysera.sdk.wallet.entities.Credentials;

public interface AccessTokenRefresherDelegate {

    void onAccessTokenRefreshed(Credentials credentials, String code);
    void onRefreshTokenInvalid();
}
