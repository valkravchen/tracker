package com.example.oop.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " руб. картой " +
                cardNumber.substring(0, 4) + "****");
    }
}
