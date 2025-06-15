package com.com.example;

public class User {
    private static int idCounter = 0;
    private String name;
    private int age;
    private boolean isActive;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.isActive = true;
        idCounter++;
    }

    public User() {
        this("Без имени", 0);
    }

    public User(String name) {
        this(name, 18);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getProfile() {
        return "Имя пользователя: " + name + "; возраст пользователя: " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public String getUserStatus() {
        if (!isActive) {
            return "Статус пользователя " + name + " является неактивным";
        }
        if (age < 18) {
            return "Пользователь: " + name + " - несовершеннолетний";
        }
        return "Пользователь: " + name + " - совершеннолетний, с активным статусом";
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getObjectReference() {
        return "Объект " + this;
    }

    public String getCallerInfo() {
        return this.getProfile() + "; адрес объекта: " + this;
    }
}
