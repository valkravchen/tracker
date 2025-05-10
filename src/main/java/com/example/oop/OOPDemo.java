package com.example.oop;

public class OOPDemo {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari");
        sportsCar.turboBoost();
        sportsCar.turboBoost();
        System.out.println(sportsCar.getSpeed());
    }
}
