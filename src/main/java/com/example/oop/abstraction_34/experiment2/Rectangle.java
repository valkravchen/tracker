package com.example.oop.abstraction_34.experiment2;

public class Rectangle extends Polygon {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int getSides() {
        return 4;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("красный", 5.0, 3.0);
        rectangle.draw();
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Количество сторон: " + rectangle.getSides());
    }
}
