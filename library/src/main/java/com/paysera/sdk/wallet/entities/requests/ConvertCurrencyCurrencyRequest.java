package com.paysera.sdk.wallet.entities.requests;

public class ConvertCurrencyCurrencyRequest {
    private Integer fromAmount;
    private String fromCurrency;
    private Integer toAmount;
    private String toCurrency;
    private String accountNumber;
    private Integer maxFromAmount;
    private Integer minToAmount;

    public Integer getFromAmount() {
        return fromAmount;
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

    public Integer getMaxFromAmount() {
        return maxFromAmount;
    }

    public void setMaxFromAmount(Integer maxFromAmount) {
        this.maxFromAmount = maxFromAmount;
    }

    public Integer getMinToAmount() {
        return minToAmount;
    }

    public void setMinToAmount(Integer minToAmount) {
        this.minToAmount = minToAmount;
    }
}
