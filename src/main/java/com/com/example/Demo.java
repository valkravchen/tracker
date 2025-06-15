package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Буратино", 10);
        System.out.println(user.getProfile());
        user.setDetails("Чиполлино", 11);
        System.out.println(user.getProfile());
    }
}