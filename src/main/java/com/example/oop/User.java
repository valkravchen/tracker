package com.example.oop;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        idCounter++;
    }

    public User(String name) {
        this(name, 0);
        System.out.println("Вызывается конструктор с одним параметром");
    }

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

