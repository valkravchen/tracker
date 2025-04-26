package com.example.oop;

public class LegoDemo {
    public static void main(String[] args) {
        Lego cube = new Lego("Кубик", "Красный");
        Lego plate = new Lego("Пластина", "Синий");
        cube.connect();
        cube.showColor();
        plate.showColor();
        System.out.println("Форма кубика: " + cube.getShape());
    }
}
