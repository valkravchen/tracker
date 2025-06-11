package com.com.example;

public class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
        System.out.println("Родительский класс: " + name);
    }

    public String getName() {
        return name;
    }
}
