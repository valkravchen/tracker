package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Porsche");
        sportsCar.startEngine();
        sportsCar.turboBoost();
        System.out.println(sportsCar.getSpeed());
    }
}
