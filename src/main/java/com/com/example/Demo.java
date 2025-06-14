package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Буратино", 5);
        user.updateProfile("Мальвина", 3, false);
        System.out.println(user.getProfile());
    }
}