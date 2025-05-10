package com.example.oop;

public class Car implements Vehicle {
    private String model;
    private int speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля " + model + " запущен");
    }
}
