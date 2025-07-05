package com.example.oop.polymorphism;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = validateModel(model);
    }

    @Override
    public String move() {
        return "Автомобиль движется: " + model;
    }

    public static String getType() {
        return "Автомобиль";
    }

    public String getParentMove() {
        return super.move();
    }

    public String tryOverrideFinale() {
        return "Невозможно переопределить final метод getDescription()";
    }

    private String validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель не может быть null или пустой строкой");
        }
        return model;
    }
}
