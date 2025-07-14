package com.example.oop.thisJava;

public class Box {
    private int width;
    private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Box(int size) {
        this(size, size);
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Box box = new Box(10);
        System.out.println(box.getArea());
    }
}
