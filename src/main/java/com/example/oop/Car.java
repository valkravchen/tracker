package com.example.oop;

public class Car {
    private String model;
    private int speed;

    public String getModel() {
        return model;
    }

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
        }
    }
}
