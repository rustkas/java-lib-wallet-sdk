package com.paysera.sdk.wallet.clients;

import com.paysera.sdk.wallet.entities.ServerConfiguration;
import com.paysera.sdk.wallet.entities.ServerInformation;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PublicWalletApiClient {
    @GET("server")
    Call<ServerInformation> getServerInformation();

    @GET("configuration")
    Call<ServerConfiguration> getServerConfiguration();
}
