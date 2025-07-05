package com.example.oop.virtualFunction;

public class Machine {
    private String brand;
    private int year;

    public Machine(String brand, int year) {
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
        if (year < 1900) {
            throw new IllegalArgumentException("Год выпуска не может быть ранее 1900, так как машины появились позже");
        }
        return year;
    }

    public String operate() {
        return "Машина работает";
    }

    public static String getType() {
        return "Общая машина";
    }

    public final String getDescription() {
        return "Машина: " + brand + ", год: " + year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
