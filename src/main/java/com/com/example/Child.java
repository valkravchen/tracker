package com.com.example;

public class Child extends Parent {
    private int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

