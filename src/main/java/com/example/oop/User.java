package com.example.oop;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    {
        name = "Имя";
        age = 18;
        System.out.println("Блок экземляра выполнен");
    }

    public User() {
        this.name = "Имя";
        this.age = 18;
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
