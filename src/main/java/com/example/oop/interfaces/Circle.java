package com.example.oop.interfaces;

public class Circle implements Drawable {
    private String color;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "чёрный";
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг радиусом " + radius + " цветом " + color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
}
