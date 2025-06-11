package com.com.example;

public class Child extends Parent {
    private int age;

    public Child() {
        this.age = 15;
        System.out.println("Дочерний класс. Первый конструктор");
    }

    public Child(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Дочерний класс. Второй конструктор");
    }

    public int getAge() {
        return age;
    }
}

