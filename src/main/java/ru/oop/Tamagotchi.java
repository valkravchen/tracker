package ru.oop;

public class Tamagotchi {

    private int weight = 100;

    public void feed() {
        weight += 10;
    }

    public String info() {
        return "Weight: " + weight;
    }

    public static void feedPet(Tamagotchi petCopy) {
        petCopy.feed();
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        System.out.println("Weight: " + pet.info());
        feedPet(pet);
        System.out.println("Weight: " + pet.info());
    }
}
