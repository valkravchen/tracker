package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.accelerate(20);
        car.accelerate(10);
        System.out.println(car.getSpeed());
    }
}
