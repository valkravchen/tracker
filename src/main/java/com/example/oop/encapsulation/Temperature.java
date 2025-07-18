package com.example.oop.encapsulation;

public class Temperature {
    private double celsius;

    public void setCelsius(double c) {
        if (c > -273.15) {
            this.celsius = c;
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setCelsius(30);
        System.out.println(temperature.getCelsius());
    }
}
