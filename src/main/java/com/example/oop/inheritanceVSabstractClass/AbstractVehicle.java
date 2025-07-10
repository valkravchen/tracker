package com.example.oop.inheritanceVSabstractClass;

public abstract class AbstractVehicle {
    private final String brand;
    private final int year;

    public AbstractVehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
}
