package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Буратино", 10);
        user.setNameNoReturn("Буратин");
        user.setAgeNoReturn(13);
        System.out.println(user.getProfile());
    }
}