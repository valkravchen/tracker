package ru.polymorphism;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Собака говорит: гав!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест кость.");
    }
}
