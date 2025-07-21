package com.example.oop.abstraction_30.experiment5;

import java.time.LocalDate;

public abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (year < 1901 || year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    abstract int getMaxSpeed();
}
