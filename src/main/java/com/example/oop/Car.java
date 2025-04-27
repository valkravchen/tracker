package com.example.oop;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void drive() {
        System.out.println(color + " " + model + " едет");
    }

    public void showColor() {
        System.out.println(model + " имеет цвет " + color);
    }

    public String getModel() {
        return model;
    }
}
