package com.paysera.sdk.wallet.entities.notification;

import com.paysera.sdk.wallet.entities.IdentifierAware;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class IosNotificationRecipient extends NotificationRecipient implements IdentifierAware {
    protected String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getType() {
        return "ios";
    }
}
