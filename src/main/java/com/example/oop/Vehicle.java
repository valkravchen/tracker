package com.example.oop;

public class Vehicle {
    private String brand;
    private int speed;
    private int id;

    public Vehicle(String brand, int speed, int id) {
        this.brand = brand;
        this.speed = speed;
        this.id = id;
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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Транспорт ID " + id + " (" + brand + ") движется со скоростью " + speed);
    }

    public void stop() {
        System.out.println("Транспорт ID " + id + " (" + brand + ") остановился");
    }
}
