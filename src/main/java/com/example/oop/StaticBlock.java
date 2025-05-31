package com.example.oop;

public class StaticBlock {
    private static String message;

    static {
        message = "Привет из статического блока!";
        System.out.println("Статический блок выполнен!");
    }

    public static void main(String[] args) {
        System.out.println(message);
    }
}
