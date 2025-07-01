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

    public String getInfo() {
        return "Транспорт: " + brand + ", год: " + year;
    }

    public String startEngine() {
        return "Двигатель запущен";
    }

    public String stopEngine() {
        return "Двигатель остановлен";
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("мопед", 1981);
        System.out.println(vehicle1.getBrand());
        System.out.println(vehicle1.getYear());
        System.out.println(vehicle1.getInfo());
        System.out.println(vehicle1.startEngine());
        System.out.println(vehicle1.stopEngine());
    }
}
