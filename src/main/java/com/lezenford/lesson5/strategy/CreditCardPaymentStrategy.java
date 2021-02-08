package com.lezenford.lesson5.strategy;

import java.math.BigDecimal;

public final class CreditCardPaymentStrategy implements PaymentStrategy {
    private final String card;

    // в данном случае требуется кредитка
    public CreditCardPaymentStrategy(String card) {
        this.card = card;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("processing %s via credit card %s\n", amount.toString(), card);
    }
}

