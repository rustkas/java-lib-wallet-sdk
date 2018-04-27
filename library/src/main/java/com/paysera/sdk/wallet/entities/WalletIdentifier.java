package com.paysera.sdk.wallet.entities;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class WalletIdentifier {
    private Wallet wallet;
    private String email;
    private String phone;

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEmpty() {
        return this.wallet == null
            && this.email == null
            && this.phone == null;
    }
}
