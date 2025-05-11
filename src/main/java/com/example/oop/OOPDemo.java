package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        SportsCar car = new SportsCar("Toyota");
        car.accelerate(15);
        System.out.println(car.getSpeed());
    }
}
