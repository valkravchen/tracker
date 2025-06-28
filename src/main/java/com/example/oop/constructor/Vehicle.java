package com.example.oop.constructor;

public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = validateBrand(brand) ? brand : "Некорректный ввод марки";
    }

    private boolean validateBrand(String brand) {
        return brand != null && !brand.trim().isEmpty();
    }

    public String getInfo() {
        return "Транспорт: " + brand;
    }
}
