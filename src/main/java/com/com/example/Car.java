package com.com.example;

public class Car {
    private String model;
    private int year;

    public Car() {
        this.model = "Без имени";
        this.year = 0;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
