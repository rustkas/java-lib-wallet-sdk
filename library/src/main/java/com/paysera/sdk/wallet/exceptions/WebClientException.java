package com.paysera.sdk.wallet.exceptions;

public class WebClientException extends WalletSdkException {
    public WebClientException() {
        super();
    }

    public WebClientException(String detailMessage) {
        super(detailMessage);
    }

    public WebClientException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public WebClientException(Throwable throwable) {
        super(throwable);
    }
}
