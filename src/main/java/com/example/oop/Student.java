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

    public void showStatus() {
        System.out.println(name + " " + (isStudying ? "учится" : "не учится"));
    }

    public String getName() {
        return name;
    }
}