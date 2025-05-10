package com.example.oop;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля "  + " запущен");
    }
}
