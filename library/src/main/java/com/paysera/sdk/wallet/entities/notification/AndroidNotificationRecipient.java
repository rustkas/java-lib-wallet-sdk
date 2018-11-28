package com.paysera.sdk.wallet.entities.notification;

import com.paysera.sdk.wallet.entities.IdentifierAware;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class AndroidNotificationRecipient extends NotificationRecipient implements IdentifierAware {
    @Override
    public String getType() {
        return "android";
    }
}
