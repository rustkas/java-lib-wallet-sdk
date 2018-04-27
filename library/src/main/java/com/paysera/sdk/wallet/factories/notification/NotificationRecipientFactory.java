package com.paysera.sdk.wallet.factories.notification;

import com.paysera.sdk.wallet.entities.notification.AndroidNotificationRecipient;
import com.paysera.sdk.wallet.entities.notification.IosNotificationRecipient;
import com.paysera.sdk.wallet.entities.notification.NotificationRecipient;
import com.paysera.sdk.wallet.entities.notification.WindowsNotificationRecipient;
import com.paysera.sdk.wallet.exceptions.WalletSdkException;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class NotificationRecipientFactory {
    public NotificationRecipient createNotificationRecipient(String type) throws WalletSdkException {
        if (type.equals("windows")) {
            return new WindowsNotificationRecipient();
        } else if (type.equals("ios")) {
            return new IosNotificationRecipient();
        } else if (type.equals("android")) {
            return new AndroidNotificationRecipient();
        }

        throw new WalletSdkException("Unknown notification recipient type");
    }
}
