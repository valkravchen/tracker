package com.example.oop;

public class SportsCar extends Car {
    public SportsCar(String model) {
        super(model);

    }

    @Override
    public void accelerate(int increment) {
        super.accelerate(increment * 2);
    }

    public void turboBoost() {
        accelerate(50);
    }
}
