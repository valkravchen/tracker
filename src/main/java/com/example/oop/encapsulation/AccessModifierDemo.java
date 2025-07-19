package com.example.oop.encapsulation;

public class AccessModifierDemo {
    private String data;

    public AccessModifierDemo() {
        this.data = "Публичный конструктор";
        System.out.println("Создан через публичный конструктор");
    }

    protected AccessModifierDemo(String data) {
        this.data = data;
        System.out.println("Создан через защищённый конструктор");
    }

    AccessModifierDemo(int value) {
        this.data = "Значение: " + value;
        System.out.println("Создан через package-private конструктор");
    }

    private AccessModifierDemo(boolean flag) {
        this.data = "Приватный " + flag;
        System.out.println("Создан через приватный конструктор");
    }
}
