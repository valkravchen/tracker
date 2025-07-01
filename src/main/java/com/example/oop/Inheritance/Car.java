package com.example.oop.Inheritance;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = validateModel(model);
    }

    private String validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель не может быть null или пустой строкой");
        }
        return model;
    }

    @Override
    public String getInfo() {
        return "Автомобиль: " + getBrand() +
                ", год: " + getYear() +
                ", модель: " + model;
    }

    @Override
    public String startEngine() {
        return "Автомобильный двигатель запущен";
    }

    @Override
    public String stopEngine() {
        return "Автомобильный двигатель остановлен";
    }

    public String getFullInfo() {
        return super.getInfo() + ", модель: " + model;
    }

    public static void main(String[] args) {
        try {
            Vehicle vehicle = new Vehicle("Toyota", 2020);
            System.out.println("Vehicle:");
            System.out.println("getInfo: " + vehicle.getInfo());
            System.out.println("startEngine: " + vehicle.startEngine());
            System.out.println("stopEngine: " + vehicle.stopEngine());
            System.out.println("Superclass: " + vehicle.getClass().getSuperclass().getSimpleName());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
