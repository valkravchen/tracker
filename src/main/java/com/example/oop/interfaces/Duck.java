package com.example.oop.interfaces;

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
}
