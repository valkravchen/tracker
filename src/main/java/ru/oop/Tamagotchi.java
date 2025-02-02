package ru.oop;

public class Tamagotchi {
    public static void main(String[] args) {
        int weight = 100;
        int weightCopy = weight;
        System.out.println("Weight: " + weight);
        System.out.println("Copy of weight: " + weightCopy);
        System.out.println();
        weightCopy += 10;
        System.out.println("Weight: " + weight);
        System.out.println("Copy of weight: " + weightCopy);
    }
}
