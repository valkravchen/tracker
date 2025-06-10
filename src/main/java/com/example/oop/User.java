package com.example.oop;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    // Конструктор
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        idCounter++;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getIdCounter() {
        return idCounter;
    }
}