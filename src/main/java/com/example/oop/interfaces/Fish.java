package com.example.oop.interfaces;

public class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        duck.fly();
        duck.swim();
        fish.swim();
    }
}
