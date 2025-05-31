package com.example.oop;

import java.util.concurrent.CancellationException;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", year: " + year);
    }
}
