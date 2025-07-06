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

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = validateBalance(balance);
    }

    public String depositAmount(double amount) {
        validateAmount(amount, "Сумма пополнения должна быть положительной");
        balance += amount;
        return "Пополнение на |" + amount + "|, новый баланс = " + balance;
    }

    public String withdraw(double amount) {
        validateAmount(amount, "Сумма снятия должна быть положительной");
        validateWithdraw(amount, balance);
        balance -= amount;
        return "Снятие |" + amount + "|, новый баланс =  " + balance;
    }

    private double validateBalance(double balance) {
        if (balance <= 0) {
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

    private void validateAmount(double amount, String message) {
        if (amount < 0) {
            throw new IllegalArgumentException(message);
        }
    }

    private void validateWithdraw(double amount, double balance) {
        if (amount > balance) {
            throw  new IllegalArgumentException("Недостаточно средств на счёте");
        }
    }
}
