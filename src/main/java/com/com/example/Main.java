package com.com.example;

import ru.inheritance.TextReport;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.balance);
        BankAccount.Transaction transaction = bankAccount.new Transaction();
        transaction.deposit(333);
        System.out.println(bankAccount.balance);
    }
}
