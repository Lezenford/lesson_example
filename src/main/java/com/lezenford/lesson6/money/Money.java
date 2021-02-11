package com.lezenford.lesson6.money;

import lombok.Getter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Currency;

@Getter
public class Money {
    private final Currency currency;
    private final BigDecimal amount;

    public Money(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Money add(Money money) {
        if (money.currency.equals(this.currency)) {
            return new Money(currency, money.amount.add(amount, MathContext.UNLIMITED).setScale(2, RoundingMode.HALF_UP));
        } else {
            throw new IllegalArgumentException("Money has different currency");
        }
    }
}
