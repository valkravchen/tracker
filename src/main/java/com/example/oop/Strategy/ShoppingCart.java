package com.example.oop.Strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Стратегия оплаты не выбрана!");
        }
        paymentStrategy.pay(amount);
    }
}
