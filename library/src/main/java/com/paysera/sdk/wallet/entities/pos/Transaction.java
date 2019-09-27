package com.paysera.sdk.wallet.entities.pos;

import com.google.gson.annotations.SerializedName;
import com.paysera.sdk.wallet.entities.Payment;

import java.util.List;

public class Transaction {
    private int id;
    @SerializedName("transaction_key")
    private String transactionKey;
    private String status;
    private String type;
    @SerializedName("created_at")
    private long createdAt;
    @SerializedName("valid_for_payment_card_debit")
    private boolean validForPaymentCardDebit;
    @SerializedName("auto_confirm")
    private boolean autoConfirm;
    @SerializedName("project_id")
    private int projectId;
    @SerializedName("location_id")
    private int locationId;
    private List<Payment> payments;

    public int getId() {
        return id;
    }

    public String getTransactionKey() {
        return transactionKey;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public boolean isValidForPaymentCardDebit() {
        return validForPaymentCardDebit;
    }

    public boolean isAutoConfirm() {
        return autoConfirm;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getLocationId() {
        return locationId;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}