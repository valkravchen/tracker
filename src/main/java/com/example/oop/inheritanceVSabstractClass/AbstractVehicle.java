package com.example.oop.inheritanceVSabstractClass;

public abstract class AbstractVehicle {
    private final String brand;
    private final int year;

    public AbstractVehicle(String brand, int year) {
        this.brand = validateBrand(brand);
        this.year = validateYear(year);
    }

    public abstract String move();

    public String stop() {
        return "Транспортное средство остановлено: " + brand + ", год: " + year;
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
        return brand.trim();
    }

    private int validateYear(int year) {
        if (year < 1886) {
            throw new IllegalArgumentException("Год выпуска не может быть ранее 1886");
        }
        return year;
    }
}
