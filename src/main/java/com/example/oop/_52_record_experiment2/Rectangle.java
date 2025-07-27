package com.example.oop._52_record_experiment2;

public record Rectangle(double width, double height) implements Calculable {
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Размеры должны быть положительными");
        }
       this.width = Math.round(width * 100.0) / 100.0;
       this.height  = Math.round(height * 100.0) / 100.0;
    }

    public Rectangle(double side) {
        this(side, side);
    }

    @Override
    public double calculate() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return  width == height;
    }

    public String getShapeInfo() {
        return "Прямоугольник " + width + "x" + height + " (площадь: " + calculate() + ")";
    }
}
