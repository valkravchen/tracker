package com.example.oop.nestedClasses;

public class Outer {
    private final String name;
    private final int id;

    public Outer(String name, int id) {
        this.name = validateName(name);
        this.id = validateId(id);
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть null или пустой строкой");
        }
        return name.trim();
    }

    private int validateId(int id) {
        if (id < 1) {
            throw new IllegalArgumentException("ID не может быть меньше 1");
        }
        return id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static class StaticNested {
        private static String getDescription() {
            return "Static nested class";
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer("Test", 1);
        System.out.println(outer.getName());
        System.out.println(outer.getId());
        System.out.println(Outer.StaticNested.getDescription());
    }
}
