package com.com.example;

public class Parent {
    private String name;

    public Parent() {
        this.name = "Безымянный";
        System.out.println("Родительский класс. Первый конструктор");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("Родительский класс. Второй конструктор");
    }

    public String getName() {
        return name;
    }
}
