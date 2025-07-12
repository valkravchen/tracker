package com.example.oop.inheritanceVSabstractClass;

public class Container {
    private final int capacity;

    public Container(int capacity) {
        this.capacity = validateCapacity(capacity);
    }

    private int validateCapacity(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Ёмкость не может быть меньше 1");
        }
        return capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    class Element {
        public String getInfo() {
            return "Inner Element";
        }
    }

    public Element createElement() {
        return new Element();
    }

    public static void main(String[] args) {
        Container container = new Container(10);
        System.out.println(container.createElement().getInfo());
    }
}
