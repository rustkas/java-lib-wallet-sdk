package com.paysera.sdk.wallet.helpers;

import java.math.BigDecimal;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class MoneyHelper {
    public static Money createFromCents(String currency, long cents) {
        BigDecimal amount = BigDecimal.valueOf(cents);
        return Money.of(
            CurrencyUnit.of(currency),
            amount.divide(BigDecimal.valueOf(100))
        );
    }

    public static Long toCents(Money money) {
        return money.getAmount().multiply(new BigDecimal(100)).longValue();
    }
}
