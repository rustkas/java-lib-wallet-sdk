package com.paysera.sdk.wallet.entities.pos;

import com.google.gson.annotations.SerializedName;
import com.paysera.sdk.wallet.helpers.MoneyHelper;
import org.joda.money.Money;

public final class Item {
    private String title;
    private long price;
    private String currency;
    private int quantity;
    @SerializedName("total_price")
    private long totalPrice;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Money getTotalPriceMoney() {
        return MoneyHelper.createFromCents(this.currency, this.totalPrice);
    }
    public Money getPriceMoney() {
        return MoneyHelper.createFromCents(this.currency, this.price);
    }
}