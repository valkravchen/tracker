package com.example.oop.inheritanceVSabstractClass;

public class Car extends AbstractVehicle implements Movable {
    private int speed;

    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String move() {
        return "Автомобиль " + getBrand() + " года " + getYear() + " движется со скоростью " + speed + " км/ч";
    }

    @Override
    public String accelerate() {
        return "Автомобиль " + getBrand() + " ускоряется до " + speed + "км/ч";
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        System.out.println(car.move());
        System.out.println(car.accelerate());
        System.out.println(car.stop());
    }
}
