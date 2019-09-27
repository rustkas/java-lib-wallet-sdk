package com.paysera.sdk.wallet.entities.pos;

import com.google.gson.annotations.SerializedName;
import com.paysera.sdk.wallet.entities.Payment;

import java.util.List;

public class TransactionPayment extends Payment {
    private List<Item> items;

    private static final class Item {
        private String title;
        private double price;
        private String currency;
        private int quantity;
        @SerializedName("total_price")
        private double totalPrice;
    }
}