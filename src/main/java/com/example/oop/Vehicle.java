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

    public static void main(String[] args) {
        Vehicle toyota = new Vehicle(1, "Toyota", 100);
        toyota.move();
        toyota.stop();
    }
}
