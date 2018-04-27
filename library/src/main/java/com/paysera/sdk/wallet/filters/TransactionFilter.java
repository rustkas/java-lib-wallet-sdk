package com.paysera.sdk.wallet.filters;

public class TransactionFilter extends BaseFilter {
    private String status;
    private Integer limit;
    private Integer offset;
    private Integer from;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }
}