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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDetails() {
        return "Имя пользователя: " + name + "; возраст пользователя: " + age;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void resetCounter() {
        idCounter = 0;
    }

    public void printInfo() {
        System.out.println("Имя пользователя: " + name + "; возраст пользователя: " + age);
    }
}

