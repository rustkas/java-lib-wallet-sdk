package com.paysera.sdk.wallet.entities.pos;

import com.google.gson.annotations.SerializedName;

public class Order {
    private int id;
    @SerializedName("transaction_key")
    private String transactionKey;
    @SerializedName("status")
    private Status status;
    @SerializedName("user_id")
    private String userId;
    private Transaction transaction;

    public int getId() {
        return id;
    }

    public String getTransactionKey() {
        return transactionKey;
    }

    public Status getStatus() {
        return status;
    }

    public String getUserId() {
        return userId;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public enum Status {
        @SerializedName("pending")
        PENDING,
        @SerializedName("reserved")
        RESERVED,
        @SerializedName("confirmed")
        CONFIRMED,
        @SerializedName("closed")
        CLOSED
    }
}