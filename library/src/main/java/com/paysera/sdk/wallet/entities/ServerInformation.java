package com.paysera.sdk.wallet.entities;

import com.google.gson.annotations.JsonAdapter;
import com.paysera.sdk.wallet.adapters.DateUnixTimestampSecondsAdapter;

import java.util.Date;

public class ServerInformation {

    @JsonAdapter(DateUnixTimestampSecondsAdapter.class)
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
