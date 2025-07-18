package com.example.oop.encapsulation;

public class Temperature {
    public double celsius;

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.celsius = -100;
        System.out.println(temperature.celsius);
    }
}
