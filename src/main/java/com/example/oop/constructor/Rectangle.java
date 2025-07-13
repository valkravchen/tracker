package com.example.oop.constructor;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int size) {
        this(size, size);
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10);
        Rectangle rectangle2 = new Rectangle(20, 30);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getArea());
    }
}
