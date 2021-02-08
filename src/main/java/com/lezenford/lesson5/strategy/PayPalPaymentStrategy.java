package com.lezenford.lesson5.strategy;

import java.math.BigDecimal;

public final class PayPalPaymentStrategy implements PaymentStrategy {
    private final String email;
    private final String token;
    // требуем учетку от paypal
    public PayPalPaymentStrategy(String email, String token) {
        this.email = email;
        this.token = token;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("processing %s via PayPal account %s\n",
                          amount.toString(), email);
    }
}

