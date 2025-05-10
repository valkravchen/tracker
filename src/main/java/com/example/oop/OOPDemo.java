package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        SportsCar car = new SportsCar("Porsche");
        car.accelerate(-10);
        System.out.println(car.getSpeed());
    }
}
