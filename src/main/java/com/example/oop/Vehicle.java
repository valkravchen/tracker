package com.example.oop;

public class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void move() {
        System.out.println(type + " движется");
    }
}
