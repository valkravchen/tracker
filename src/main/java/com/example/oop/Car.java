package com.example.oop;

public class Car {
    private String model;
    private int speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }
}
