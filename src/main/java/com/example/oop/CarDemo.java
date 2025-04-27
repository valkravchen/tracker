package com.example.oop;

public class CarDemo {
    public static void main(String[] args) {
        Car sedan = new Car("Седан", "Красный");
        Car suv = new Car("Внедорожник", "Чёрный");
        sedan.drive();
        sedan.showColor();
        suv.showColor();
        System.out.println("Модель: " + sedan.getModel());
    }
}
