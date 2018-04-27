package com.paysera.sdk.wallet;

import com.paysera.sdk.wallet.interfaces.TimestampSynchronizedCallback;

public class ClientServerTimeSynchronizationConfiguration {
    private Boolean enabled;
    private TimestampSynchronizedCallback timestampSynchronizedCallback;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public TimestampSynchronizedCallback getTimestampSynchronizedCallback() {
        return timestampSynchronizedCallback;
    }

    public void setTimestampSynchronizedCallback(
        TimestampSynchronizedCallback timestampSynchronizedCallback
    ) {
        this.timestampSynchronizedCallback = timestampSynchronizedCallback;
    }
}
