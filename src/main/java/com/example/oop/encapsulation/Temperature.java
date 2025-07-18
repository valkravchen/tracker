package com.example.oop.encapsulation;

public class Temperature {
    private double kelvin;

    public void setCelsius(double c) {
        this.kelvin = c + 273.15;
    }

    public double getFahrenheit() {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setCelsius(0);
        System.out.println(temperature.getFahrenheit());
    }
}
