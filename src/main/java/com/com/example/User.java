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

    public static int getIdCounter() {
        return idCounter;
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

    public void updateProfile(String name, int age, boolean active) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        }
        this.isActive = active;
    }

    public boolean canAccessPremium() {
        return isActive && age >= 18;
    }

    public String getFullProfile() {
        return "Пользователь: " + getUserStatus() + "; доступ к премиум-классу: " + canAccessPremium();
    }

    public String getFullInfo() {
        String status = getUserStatus();
        return "Пользователь: " + this.name +
                "; возраст пользователя: " + this.age +
                "; стаус пользователя: " + status;
    }

    public void updateAll(String name, int age) {
        this.setName(name);
        setAge(age);
        this.isActive = true;
    }

    public String getPersonalizedGreeting() {
        if (isActive) {
            if (age < 18) {
                return "Привет, несовершеннолетний пользователь " + name + "!";
            }
            return "Привет, " + name + "!"; // Использует поле объекта
        }
        return name + ", активируйте аккаунт!"; // Использует поле объекта
    }

    public boolean isEligibleForDiscount() { // Нестатический метод
        return isActive && age >= 60;      // Зависит от полей объекта
    }

    public void resetProfile() {
        this.name = "Безымянный";
        this.age = 0;
        this.isActive = false;
    }

    public String getSelfDescription() {
        return this.getProfile() + "; активность: " + this.isActive;
    }

    public String getDetailedStatus() {
        String status = getUserStatus();
        return status + ", ID: " + idCounter;
    }
}
