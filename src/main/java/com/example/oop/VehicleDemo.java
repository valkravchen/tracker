package com.example.oop;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        Vehicle truck = new Vehicle("Truck");
        car.move();
        truck.move();
    }
}
