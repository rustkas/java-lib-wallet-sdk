package com.paysera.sdk.wallet.entities;

import com.paysera.sdk.wallet.helpers.MoneyHelper;
import org.joda.money.Money;

public class CurrencyConversionCalculation {
    private Integer fromAmount;
    private String fromCurrency;
    private Integer toAmount;
    private String toCurrency;
    private String accountNumber;

    public Integer getFromAmount() {
        return fromAmount;
    }

    public Money getFromAmountMoney() {
        return MoneyHelper.createFromCents(fromCurrency, fromAmount);
    }

    public void setFromAmount(Integer fromAmount) {
        this.fromAmount = fromAmount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public Integer getToAmount() {
        return toAmount;
    }

    public Money getToAmountMoney() {
        return MoneyHelper.createFromCents(toCurrency, toAmount);
    }

    public void setToAmount(Integer toAmount) {
        this.toAmount = toAmount;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
