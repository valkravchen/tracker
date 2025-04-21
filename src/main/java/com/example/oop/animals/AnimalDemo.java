package com.example.oop.animals;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog("Тузик");
        Animal cat = new Cat("Мурзик");
        Animal bird = new Bird("Воробей");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

