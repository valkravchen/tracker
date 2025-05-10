package com.example.oop;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, int speed, int id, String model) {
        super(brand, speed, id);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void move() {
        System.out.println("Автомобиль " + getBrand() + " " + model +
                " (ID " + getId() + ") едет со скоростью " + getSpeed());
    }

    public void accelerate() {
        int speed = getSpeed() + 10;
        System.out.println("Автомобиль " + getBrand() + " " + model + " ускорился до " + speed);
    }
}

