package com.lezenford.lesson5.strategy;

public class Main {
    public static void main(String[] args) {

        // создаём и наполняем заказ
        Order order = new Order();

        // выбор конкретной стратегии и оплата заказа
        PaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy("example@example.com", "token");
        order.pay(payPalPaymentStrategy);

        // выбор конкретной стратегии и оплата заказа
        PaymentStrategy creditCardPaymnetStrategy = new CreditCardPaymentStrategy("1234 5678");

        order.pay(creditCardPaymnetStrategy);
    }
}
