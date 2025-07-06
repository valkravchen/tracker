package com.example.oop.encapsulation;

public class AccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Bob", 2000.0, "1234567890");
        System.out.println(bankAccount.getAccountHolder());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.deposit(1000.0));
        System.out.println(bankAccount.withdraw(500));
    }
}
