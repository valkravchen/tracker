package com.example.oop.constructor;

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle("Honda", "Sport");
        Motorcycle motorcycle2 = new Motorcycle("Cruiser");
        System.out.println(motorcycle1.getInfo());
        System.out.println(motorcycle2.getInfo());
    }
}
