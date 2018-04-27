package com.paysera.sdk.wallet.filters;

public class CardFilter extends BaseFilter {
    private String status;
    private Integer userId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
