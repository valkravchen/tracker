package com.com.example;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    class Transaction {
        void deposit(double amount) {
            balance += amount;
        }
    }
}
