package com.example.oop;

public class Car {
    private String model;
    private int speed;
    private boolean isRunning;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
        System.out.println(model + " запущен");
    }
}
