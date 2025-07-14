package com.example.oop.staticMethod;

public class TemperatureConverter {
    public static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        System.out.println(TemperatureConverter.toFahrenheit(25));
    }
}
