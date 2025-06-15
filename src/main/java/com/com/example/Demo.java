package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Буратино", 10);
        user.setNameAndReturn("Буратин").setAgeAndReturn(-3);
        System.out.println(user.getProfile());
    }
}