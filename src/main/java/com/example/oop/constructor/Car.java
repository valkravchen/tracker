package com.example.oop.constructor;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model) {
        this(make, model, 2025);
    }

    public Car() {
        this("Марка неизвестна", "Модель неизвестна", 2025);
    }
}
