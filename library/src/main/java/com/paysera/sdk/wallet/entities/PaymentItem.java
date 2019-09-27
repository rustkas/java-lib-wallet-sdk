package com.paysera.sdk.wallet.entities;

import com.paysera.sdk.wallet.helpers.MoneyHelper;
import org.joda.money.Money;

public class PaymentItem {
    private String title;
    private Long price;
    private String currency;
    private Integer quantity;
    private Long totalPrice;

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