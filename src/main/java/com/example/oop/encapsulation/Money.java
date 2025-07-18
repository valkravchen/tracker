package com.example.oop.encapsulation;

public class Money {
    private final int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        Money money = new Money(1000);
        System.out.println(money.getAmount());

    }
}
