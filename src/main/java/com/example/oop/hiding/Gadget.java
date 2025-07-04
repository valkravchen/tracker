package com.example.oop.hiding;

public class Gadget {
    private String brand;
    private int year;

    public Gadget(String brand, int year) {
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
        if (year < 1970) {
            throw new IllegalArgumentException("Год выпуска не может быть ранее 1970");
        }
        return year;
    }

    public static String getCategory() {
        return "Общий гаджет";
    }

    public String getInfo() {
        return "Гаджет: " + brand + ", год: " + year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

