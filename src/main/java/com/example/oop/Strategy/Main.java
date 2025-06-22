package com.example.oop.Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        cart.checkOut(1000);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkOut(3000);
    }
}
