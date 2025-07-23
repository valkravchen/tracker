package com.example.oop.abstraction_35.experiment1;

public class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " крякает");
    }

    @Override
    public void fly() {
        System.out.println(name + " летит");
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает");
    }

    public static void main(String[] args) {
        Duck duck = new Duck("Дональд");
        duck.makeSound();
        duck.fly();
        duck.swim();
    }
}
