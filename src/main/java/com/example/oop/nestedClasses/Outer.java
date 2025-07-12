package com.example.oop.nestedClasses;

import com.example.oop.inheritanceVSabstractClass.Action;

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

    public class Inner {
        public String getInfo() {
            return "Inner class, outer name: " + name + ", id: " + id;
        }
    }

    public Inner createInner() {
        return new Inner();
    }

    public String processLocal(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        }
        class Local {
            public String compute() {
                return "Local class, value: " + value + ", outer name: " + name;
            }
        }
        Local local = new Local();
        return local.compute();
    }

    public String performAction(Action action) {
        return action.execute() + " from outer";
    }


    public static void main(String[] args) {
        Outer outer = new Outer("Test", 1);
        System.out.println(outer.performAction(new Action() {
            @Override
            public String execute() {
                return "Anonymous execute";
            }
        }));
    }
}
