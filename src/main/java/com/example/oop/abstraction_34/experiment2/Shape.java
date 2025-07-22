package com.example.oop.abstraction_34.experiment2;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double getArea();

    abstract double getPerimeter();

    abstract void draw();
}
