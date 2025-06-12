package com.com.example;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    public User(String name, int age) {
       this(name);
       this.age = age;
        idCounter++;
        System.out.println("Вызов первого конструктора");
    }

    public User(String name) {
       this.name = "Нет имени";
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
