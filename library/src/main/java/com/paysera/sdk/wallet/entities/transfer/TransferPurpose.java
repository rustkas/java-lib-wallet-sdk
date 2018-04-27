package com.paysera.sdk.wallet.entities.transfer;

public class TransferPurpose {
    private String details;
    private String reference;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
