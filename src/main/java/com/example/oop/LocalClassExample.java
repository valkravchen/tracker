package com.example.oop;

public class LocalClassExample {
    public void printMessage() {
        final String localVar = "Локальная переменная";
        class LocalPrinter {
            public void print() {
                System.out.println(localVar);
            }
        }
    }
}
