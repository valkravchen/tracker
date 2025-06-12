package com.com.example;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    public User(String name, int age) {
       this.name = name;
        this.age = age;
        idCounter++;
        System.out.println("Вызов первого конструктора");
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
        idCounter++;
        System.out.println("Вызов второго конструктора");
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
