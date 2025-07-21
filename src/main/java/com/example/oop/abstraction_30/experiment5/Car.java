package com.example.oop.abstraction_30.experiment5;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public int getMaxSpeed() {
        return 200;
    }

    public int getDoors() {
        return doors;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 4);
        System.out.println("Марка: " + car.getBrand());
        System.out.println("Год: " + car.getYear());
        System.out.println("Двери: " + car.getDoors());
        System.out.println("Максимальная скорость: " + car.getMaxSpeed());
    }
}
