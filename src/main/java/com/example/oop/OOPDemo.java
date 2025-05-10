package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        SportsCar car = new SportsCar("Toyota");
        car.accelerate(50);
        car.turboBoost();
        System.out.println(car.getSpeed());
    }
}
