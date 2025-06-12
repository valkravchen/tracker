package com.com.example;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        idCounter++;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("С днём рождения, " + name + "! Вам исполнилось " + age + "!");
    }

    public String getGreeting() {              // Нестатический метод для поведения
        return "Привет! Меня зовут  " + name;
    }
}
