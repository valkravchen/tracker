package com.example.oop;

public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getBalance());
        account.deposit(7);
        System.out.println(account.getBalance());
    }
}
