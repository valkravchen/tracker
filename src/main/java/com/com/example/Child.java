package com.com.example;

public class Child extends Parent {
    private int age;

    public Child() {
        // super(); // Вставляется автоматически
        this.age = 18;
    }

    public int getAge() {
        return age;
    }
}

