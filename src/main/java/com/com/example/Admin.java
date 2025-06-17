package com.com.example;

public class Admin extends User {
    private String role;

    public Admin(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public String getStatus() {
        return super.getStatus() + "; роль: " + role;
    }
}
