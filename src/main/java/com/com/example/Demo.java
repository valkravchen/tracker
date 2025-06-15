package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getProfile());
        user.updateDetails("Чиполлино", -4);
        System.out.println(user.getProfile());
        user.setAgeAndReturn(3).setNameAndReturn("Буратино");
        System.out.println(user.getProfile());
    }
}