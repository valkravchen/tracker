package com.com.example;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    public User(String name, int age) {
       this.name = name;
       this.age = age;
        idCounter++;
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

    public static void resetCounter() {
        idCounter = 0;
    }

    public static String formatUserInfo(String name, int age) {
        return "Имя: " + name + "; возраст: " + age;
    }
}
