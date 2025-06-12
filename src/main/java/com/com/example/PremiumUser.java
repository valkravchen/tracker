package com.com.example;

public class PremiumUser extends User {
    public PremiumUser(String name, int age) {
        super(name, age);
    }

    public static int getIdCounter() {
        return 100;
    }
}
