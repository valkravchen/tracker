package com.example.oop;

public class Main {
    public static void main(String[] args) {
        Vehicle toyota = new Vehicle(1, "Toyota", 100);
        toyota.move();
        toyota.stop();
    }
}
