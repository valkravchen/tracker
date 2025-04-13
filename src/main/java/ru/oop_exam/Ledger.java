package ru.oop_exam;

public class Ledger {
    private String owner;
    private int amount;

    public Ledger(String owner, int amount) {
        this.owner = owner;
        this.amount = amount;
    }

    void check() {
        System.out.println(owner + " имеет " + amount + " рублей");
    }

    void addAmount(int value) {
        amount += value;
        System.out.println("Добавлено " + value + " рублей");
    }

    public String getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }
}
