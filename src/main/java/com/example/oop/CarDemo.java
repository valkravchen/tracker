package com.example.oop;

public class CarDemo {
    public static void main(String[] args) {
        Car sedan = new Car("Седан");
        Car truck = new Car("Грузовик");
        sedan.start();
        truck.start();
        sedan.setSpeed(60);
        sedan.showStatus();
        truck.showStatus();
    }
}
