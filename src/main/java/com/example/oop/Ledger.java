package com.example.oop;

public class Ledger {
    private String owner;
    private int amount;

    public Ledger(String owner, int amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public void check() {
        System.out.println(owner + " имеет " + amount + " рублей");
    }

    public String getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }

    public void addAmount(int value) {
        if (value >= 0) {
            amount += value;
            System.out.println("Добавлено " + value + " рублей");
        }
    }
}
