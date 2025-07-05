package com.example.oop.encapsulation;

public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = validateOwner(owner);
        this.balance = validateBalance(balance);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = validateBalance(balance);
    }

    public String deposit(double amount) {
        validateAmount(amount, "Сумма пополнения должна быть положительной");
        balance += amount;
        return "Пополнение на " + amount + ", новый баланс: " + balance;
    }

    public String withdraw(double amount) {
        validateAmount(amount, "Сумма снятия должна быть положительной");
        validateWithdraw(amount, balance);
        balance -= amount;
        return "Снятие " + amount + ", новый баланс: " + balance;
    }

    private String validateOwner(String owner) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Владелец не может быть null или пустой строкой");
        }
        return owner;
    }

    private double validateBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
        return balance;
    }

    private void validateAmount(double amount, String message) {
        if (amount <= 0) {
            throw new IllegalArgumentException(message);
        }
    }

    private void validateWithdraw(double amount, double balance) {
        if (amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств на счёте");
        }
    }
}
