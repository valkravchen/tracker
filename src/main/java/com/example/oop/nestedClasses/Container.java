package com.example.oop.nestedClasses;

public class Container {
    private final int capacity;

    public Container(int capacity) {
        this.capacity = validateCapacity(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public class Element {
        public String getContainerInfo() {
            return "Inner Element, container capacity: " + capacity;
        }
    }

    public Element createElement() {
        return new Element();
    }

    private int validateCapacity(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Ёмкость не может быть меньше 1");
        }
        return capacity;
    }

    public static void main(String[] args) {
        Container container = new Container(10);
        System.out.println(container.createElement().getContainerInfo());
    }
}
