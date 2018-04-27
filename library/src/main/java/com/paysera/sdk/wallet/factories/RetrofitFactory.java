package com.paysera.sdk.wallet.factories;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.paysera.sdk.wallet.Router;
import com.paysera.sdk.wallet.clients.OAuthClient;
import com.paysera.sdk.wallet.clients.PublicWalletApiClient;
import com.paysera.sdk.wallet.clients.WalletApiClient;
import com.paysera.sdk.wallet.entities.MetadataAwareResponse;
import com.paysera.sdk.wallet.entities.WalletBalance;
import com.paysera.sdk.wallet.helpers.MoneyHelper;
import com.paysera.sdk.wallet.adapters.MetadataAwareResponseDeserializer;
import com.paysera.sdk.wallet.deserializers.WalletBalanceDeserializer;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.Executors;

public class RetrofitFactory {
    private Router router;

    public RetrofitFactory(Router router) {
        this.router = router;
    }

    public OAuthClient createOAuthClient(OkHttpClient httpClient) {
        return this
            .createRetrofit(
                this.router.getoAuthApiEndpoint(),
                httpClient
            )
            .create(OAuthClient.class);
    }

    public Retrofit createWalletApiRetrofit(OkHttpClient httpClient) {
        return this
            .createRetrofit(
                this.router.getWalletApiEndpoint(),
                httpClient
            );
    };

    public WalletApiClient createWalletApiClient(OkHttpClient httpClient) {
       return this
           .createRetrofit(
               this.router.getWalletApiEndpoint(),
                httpClient
            )
           .create(WalletApiClient.class);
    }

    public PublicWalletApiClient createPublicWalletApiClient(OkHttpClient httpClient) {
        return this
            .createRetrofit(
                this.router.getWalletApiEndpoint(),
                httpClient
            )
            .create(PublicWalletApiClient.class);
    }

    public Retrofit createRetrofit(String baseUrl, OkHttpClient httpClient) {
        return new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(GsonFactory.createGson()))
            .client(httpClient)
            .callbackExecutor(Executors.newCachedThreadPool())
            .build();
    }
}
