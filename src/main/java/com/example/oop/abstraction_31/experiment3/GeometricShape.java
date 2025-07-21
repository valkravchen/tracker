package com.example.oop.abstraction_31.experiment3;

public abstract class GeometricShape {
    protected String name;

    public GeometricShape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract void draw();

    public void showInfo() {
        System.out.println("Фигура: " + name);
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        draw();
    }
}
