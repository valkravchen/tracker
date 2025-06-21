package com.com.example;

public class BankAccount {
    public double balance;

    class Transaction {
        void deposit(double amount) {
            balance += amount;
        }
    }
}
