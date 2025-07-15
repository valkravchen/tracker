package com.example.oop.hiding;

public class Child extends Parent {
    public static void greet() {
        System.out.println("Привет от ребёнка");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.greet();
    }
}
