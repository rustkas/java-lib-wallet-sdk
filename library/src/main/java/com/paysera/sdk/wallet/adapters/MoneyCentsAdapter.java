package com.paysera.sdk.wallet.adapters;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.paysera.sdk.wallet.helpers.MoneyHelper;

import java.io.IOException;

import org.joda.money.Money;

public class MoneyCentsAdapter extends TypeAdapter<Money> {

    @Override
    public void write(JsonWriter out, Money value) throws IOException {

    }

    @Override
    public Money read(JsonReader in) throws IOException {
        String currency = null;
        Long amount = in.nextLong();
        String nextName = in.nextName();
        if (nextName.equals("currency")) {
            currency = in.nextString();
        }
        return MoneyHelper.createFromCents(currency, amount);
    }

}
