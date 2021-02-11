package com.lezenford.lesson6.money;

import java.math.BigDecimal;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        final Money first = new Money(Currency.getInstance("RUB"), new BigDecimal("100.23"));
        final Money second = new Money(Currency.getInstance("RUB"), new BigDecimal("100.22"));
        System.out.println(first.add(second).getAmount());
    }
}