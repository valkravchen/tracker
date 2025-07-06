package com.example.oop.encapsulation;

public class BankAccount {
    private final String accountHolder;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountHolder, double balance, String accountNumber) {
        this.accountHolder = validateAccountHolder(accountHolder);
        this.balance = validateBalance(balance);
        this.accountNumber = validateAccountNumber(accountNumber);
    }

    private String validateAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Владелец не может быть null или пустой строкой");
        }
        return accountHolder;
    }

    private double validateBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным*");
        }
        return balance;
    }

    private String validateAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty() || accountNumber.length() != 10) {
            throw new IllegalArgumentException("Номер счёта должен быть строкой длиной 10 символов");
        }
        return accountNumber;
    }
}
