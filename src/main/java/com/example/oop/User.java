package com.example.oop;

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

    public User(String name) {
        this.name = name;
        System.out.println("Вызов второго конструктора");
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getIdCounter() {
        return  idCounter;
    }
 }
