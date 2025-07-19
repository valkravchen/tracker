package com.example.oop.interfaces;

public class DrawingDemo {
    public static void main(String[] args) {
        Drawable[] shapes = {
                new Circle(5.0),
                new Rectangle(10, 20),
                new Circle(3.0)
        };
        for (Drawable shape : shapes) {
            shape.setColor("красный");
            shape.draw();
        }
    }
}
