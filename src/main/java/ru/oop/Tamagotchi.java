package ru.oop;

public class Tamagotchi {

    private int weight = 100;

    public void feed() {
        weight += 10;
    }

    public String info() {
        return "Weight: " + weight;
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        Tamagotchi petCopy = pet;
        System.out.println("Weight: " + pet.info());
        System.out.println("Copy of weight: " + petCopy.info());
        petCopy.feed();
        System.out.println("Weight: " + pet.info());
        System.out.println("Copy of weight: " + petCopy.info());
    }
}
