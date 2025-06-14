package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Буратино");
        System.out.println(user.getProfile());
        user.updateDetails("Барбос", 33);
        System.out.println(user.getProfile());
        user.setNameAndReturn("Кондрат").setAgeAndReturn(36);
        System.out.println(user.getProfile());
    }
}