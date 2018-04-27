package com.paysera.sdk.wallet.interfaces;

import java.util.Date;

public interface TimestampSynchronizedCallback {

    void onTimestampUpdated(Date serverTime, Date currentTime);
}
