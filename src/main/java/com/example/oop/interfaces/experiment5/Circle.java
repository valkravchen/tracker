package com.example.oop.interfaces.experiment5;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 4),
                new Circle(3)
        };

        for (Shape shape : shapes) {
            System.out.println("Плащадь фигуры: " + shape.getArea());
        }
    }
}
