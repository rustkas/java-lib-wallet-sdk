package com.paysera.sdk.wallet.entities.requests;

public class ConfirmPhoneRequest {
    private String code;

    public ConfirmPhoneRequest(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
