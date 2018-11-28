package com.paysera.sdk.wallet.entities.notification;

import com.paysera.sdk.wallet.entities.IdentifierAware;

public class FirebaseNotificationRecipient extends NotificationRecipient implements IdentifierAware {
    @Override
    public String getType() {
        return "firebase";
    }
}
