package com.example.oop;

public class Constructor {
    private String name;
    private int number;

    public Constructor() {
        this("Unknown", 0);
    }

    public Constructor(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
