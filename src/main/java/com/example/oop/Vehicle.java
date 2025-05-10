package com.example.oop;

public class Vehicle {
    private String brand;
    private int speed;
    private int id;

    public Vehicle(int id, String brand, int speed) {
        this.id = id;
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getId() {
        return id;
    }

    public void move() {
        System.out.println(brand + " движется со скоростью " + speed);
    }

    public void stop() {
        System.out.println("Остановка движения у " + brand);
    }
}
