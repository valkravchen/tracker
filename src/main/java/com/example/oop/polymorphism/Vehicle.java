package com.example.oop.polymorphism;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = validateBrand(brand);
        this.year = validateYear(year);
    }

    public String move() {
        return "Транспорт движется";
    }

    public static String getType() {
        return "Общий транспорт";
    }

    public final String getDescription() {
        return "Транспорт: " + brand + ", год: " + year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    private String validateBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Марка не может быть null или пустой строкой");
        }
        return brand;
    }

    private int validateYear(int year) {
        if (year < 1900) {
            throw new IllegalArgumentException("Год выпуска не может быть ранее 1900, так как машины появились позже");
        }
        return year;
    }
}
