package com.example.oop;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
        this.age = 18;
    }

    public Student() {
        this.name = "Безымянный";
        this.age = 18;
    }
}
