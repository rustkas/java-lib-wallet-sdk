package com.paysera.sdk.wallet.entities.notification;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
abstract public class NotificationRecipient {
    public abstract String getType();

    @Override
    public boolean equals(Object object) {
        return
                object instanceof NotificationRecipient
            && this.getType().equals(((NotificationRecipient) object).getType())
        ;
    }
}
