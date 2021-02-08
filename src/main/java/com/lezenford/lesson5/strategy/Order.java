package com.lezenford.lesson5.strategy;

import java.math.BigDecimal;

public class Order {
    public void pay(PaymentStrategy strategy) {
        BigDecimal total = getTotal();
        strategy.pay(total);
    }

    public BigDecimal getTotal() {
        return BigDecimal.valueOf(Math.random() * 100.0);
    }
}

