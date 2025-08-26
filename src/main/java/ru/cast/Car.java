package ru.cast;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге.");
    }
}
