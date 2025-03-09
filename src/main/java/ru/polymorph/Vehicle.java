package ru.polymorph;

public interface Vehicle extends Fuel {
    void accelerate();

    void brake();

    void steer();

    void changeGear();
}
