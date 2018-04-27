package com.paysera.sdk.wallet.factories.notification;

import com.paysera.sdk.wallet.factories.GsonFactory;
import com.paysera.sdk.wallet.normalizers.NotificationEventNormalizer;
import com.paysera.sdk.wallet.normalizers.NotificationRecipientNormalizer;
import com.paysera.sdk.wallet.normalizers.NotificationSubscriberNormalizer;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class NotificationNormalizerFactory {
    public NotificationSubscriberNormalizer createNotificationSubscriberNormalizer() {
        return new NotificationSubscriberNormalizer(
            this.createNotificationRecipientNormalizer(),
            this.createNotificationEventsNormalizer()
        );
    }

    public NotificationRecipientNormalizer createNotificationRecipientNormalizer() {
        return new NotificationRecipientNormalizer(new NotificationRecipientFactory());
    }

    public NotificationEventNormalizer createNotificationEventsNormalizer() {
        return new NotificationEventNormalizer(GsonFactory.createGson());
    }
}
