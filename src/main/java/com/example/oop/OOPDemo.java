package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.startEngine();
        car.accelerate(30);
        System.out.println("Модель: " + car.getModel() + ", Скорость: " + car.getSpeed());

        SportsCar sportsCar = new SportsCar("Ferrari");
        sportsCar.startEngine();
        sportsCar.turboBoost();
        System.out.println("Модель: " + sportsCar.getModel() + ", Скорость: " + sportsCar.getSpeed());
    }
}
