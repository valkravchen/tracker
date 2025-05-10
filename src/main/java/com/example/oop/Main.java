package com.example.oop;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", 120, 2, "Civic");
        car.move();
        car.accelerate();
        car.move();
        car.stop();
    }
}
