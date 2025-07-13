package com.example.oop.constructor;

public class Car extends Vehicle {
    public String drive() {
        return "Машина едет";
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.drive());
    }
}
