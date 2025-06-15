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
        this.name = (name != null) ? name : "Без имени";
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

    public String toString() {
        return getProfile();
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }
}
