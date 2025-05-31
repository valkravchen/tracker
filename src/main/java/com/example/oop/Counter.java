package com.example.oop;

public class Counter {
    public static int totalCount = 0;

    public Counter() {
        totalCount++;
    }

    public void displayInfo() {
        System.out.println("Количество: " + totalCount);
    }
}
