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

    private String getName() {
        return name;
    }

    private int getAge() {
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
        isActive = active;
    }

    public String getUserStatus() {    // Бизнес-логика: статус
        if (!isActive) {               // Проверяет активность
            return name + " - неактивный пользователь";
        }
        if (age < 18) {                // Проверяет возраст
            return name + " - несовершеннолетний пользователь";
        }
        return name + " - активный совершеннолетний пользователь";
    }

    public static int getIdCounter() { // Статический метод
        return idCounter;             // Возвращает количество
    }
}
