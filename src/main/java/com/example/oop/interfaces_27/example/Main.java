package com.example.oop.interfaces_27.example;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Shape() {
                    @Override
                    public double getArea() {
                        return 10;
                    }
                }
        };
        for (Shape shape : shapes) {
            System.out.println("Площадь: " + shape.getArea());
        }
    }
}
