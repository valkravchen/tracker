package com.com.example;

public class PremiumUser extends User {
    public PremiumUser(String name, int age) {
        super(name, age);
    }

    public String getUserStatus() {
        if (!isActive()) {
            return "Статус пользователя " + getName() + " является неактивным";
        }
        if (getAge() < 18) {
            return "Пользователь: " + getName() + " - несовершеннолетний";
        }
        return "Пользователь: " + getName() + " - совершеннолетний, с активным премиум-статусом";
    }
}

