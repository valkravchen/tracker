package com.example.oop.thisJava;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void printModel() {
        System.out.println(model);
    }

    public static void main(String[] args) {
        Car car = new Car("Volvo");
        car.printModel();
    }
}
