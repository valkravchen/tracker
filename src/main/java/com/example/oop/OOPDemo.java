package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.starEngine();
        car.accelerate(30);
        System.out.println("Модель: " + car.getModel() + ", Скорость: " + car.getSpeed());

        SportsCar sportsCar = new SportsCar("Ferrari");
        sportsCar.turboBoost();
        System.out.println("Модель: " + sportsCar.getModel() + ", Скорость: " + sportsCar.getSpeed());

        Car porsche = new SportsCar("Porsche");
        porsche.accelerate(30);
        System.out.println("Модель: " + porsche.getModel() + ", Скорость: " + porsche.getSpeed());

        Car.Engine engine = car.new Engine(150);
        System.out.println("Мощность двигателя: " + engine.getPower());
        System.out.println("Всего автомобилей: " + Car.getCarCount());
    }
}
