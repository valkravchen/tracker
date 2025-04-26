package com.example.oop;

public class Lego {
    private String shape;
    private String color;

    public Lego(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public void connect() {
        System.out.println(shape + " соединяется");
    }

    public void showColor() {
        System.out.println(shape + " имеет цвет" + color);
    }

    public String getShape() {
        return shape;
    }
}
