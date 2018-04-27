package com.paysera.sdk.wallet.adapters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.paysera.sdk.wallet.entities.Wallet;
import com.paysera.sdk.wallet.entities.WalletIdentifier;

import java.io.IOException;

public class WalletIdentifierAdapter extends TypeAdapter<WalletIdentifier> {

    @Override
    public void write(JsonWriter out, WalletIdentifier walletIdentifier) throws IOException {
        String email = walletIdentifier.getEmail();
        String phone = walletIdentifier.getPhone();
        Wallet wallet = walletIdentifier.getWallet();
        out.beginObject();
        if (email != null) {
            out.name("email").value(email);
        }
        if (phone != null) {
            out.name("phone").value(phone);
        }
        if (wallet != null) {
            out.name("id").value(wallet.getId());
        }
        out.endObject();
    }

    @Override
    public WalletIdentifier read(JsonReader in) throws IOException {
        WalletIdentifier walletIdentifier = new WalletIdentifier();
        in.beginObject();
        while (in.hasNext()) {
            String name = in.nextName();
            switch (name) {
                case "id":
                    Wallet wallet = new Wallet();
                    wallet.setId(in.nextInt());
                    walletIdentifier.setWallet(wallet);
                    break;
                case "email":
                    walletIdentifier.setEmail(in.nextString());
                    break;
                case "phone":
                    walletIdentifier.setPhone(in.nextString());
                    break;
            }
        }
        in.endObject();
        return walletIdentifier;

    }
}
