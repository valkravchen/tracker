package com.example.oop._52_record_experiment2;

public class GeometryCalculator {
    void processRectangle(Rectangle rect) {
        System.out.println("Обработка прямоугольника:");
        System.out.println(rect.getShapeInfo());
        System.out.println("Периметр: " + rect.getPerimeter());
        System.out.println("Это квадрат: " + rect.isSquare());
        System.out.println("Расчет через интерфейс: " + rect.calculate());
    }

    public static void main(String[] args) {
        GeometryCalculator calculator = new GeometryCalculator();
        Rectangle rect1 = new Rectangle(5.678, 3.234);
        calculator.processRectangle(rect1);
        Rectangle square = new Rectangle(4.0);
        calculator.processRectangle(square);
        try {
            new Rectangle(-1, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }
    }
}
