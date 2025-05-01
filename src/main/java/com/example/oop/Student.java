package com.example.oop;

public class Student {
    private String name;
    private boolean isStudying;

    public Student(String name) {
        this.name = name;
        this.isStudying = false;
    }

    public void study() {
        isStudying = true;
        System.out.println(name + " учится");
    }
}