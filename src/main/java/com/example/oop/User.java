package com.example.oop;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static class StaticNested {
        public void display() {
            System.out.println("Статический вложенный класс: idCounter = " + idCounter);
        }
    }

    public class Inner {
        public void display() {
            System.out.println("Внутренний класс: имя = " + name + "; возраст = " + age);
        }
    }

    public void createLocalClass() {
        final String prefix = "Пользователь: ";
        class Local {
            public void display() {
                System.out.println(prefix + name);
            }
        }

        Local local = new Local();
        local.display();
    }

    public Runnable createAnonymousClass() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный класс: имя = " + name);
            }
        };
    }
}

