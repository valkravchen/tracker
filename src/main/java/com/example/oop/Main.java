package com.example.oop;

public class Main {
    public static void main(String[] args) {
        Vehicle toyota = new Vehicle("Toyota", 100, 1);
        Car car = new Car("Honda", 120, 2, "Civic");
        toyota.move();
        toyota.stop();
        car.move();
        car.accelerate();
        car.move();
        car.stop();
    }
}
