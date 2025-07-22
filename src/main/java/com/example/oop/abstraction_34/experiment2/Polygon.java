package com.example.oop.abstraction_34.experiment2;

public abstract class Polygon extends Shape {
    public Polygon(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Рисую многоугольник цветом " + color);
    }

    abstract int getSides();
}
