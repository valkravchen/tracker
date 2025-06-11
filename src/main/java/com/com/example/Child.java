package com.com.example;

public class Child extends Parent {
    private int age;

    public Child(int age) {
        this.age = age;
        System.out.println("Дочерний класс:");
    }

    public int getAge() {
        return age;
    }
}

