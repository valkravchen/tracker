package com.example.oop.Inheritance;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = validateBrand(brand);
        this.year = validateYear(year);
    }

    private String validateBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Марка не может быть null или пустой строкой");
        }
        return brand;
    }

    private int validateYear(int year) {
        if (year < 1886) {
            throw new IllegalArgumentException("Год выпуска не может быть ранее 1886");
        }
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
