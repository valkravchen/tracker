package com.example.oop.interfaces;

public class Rectangle implements Drawable {
    private String color;
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "чёрный";
    }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник " + width + "x" + height + " цветом " + color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
