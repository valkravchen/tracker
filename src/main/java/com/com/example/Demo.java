package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Буратино", 10);
        System.out.println(user.getStatus());
        Admin admin = new Admin("Папа Карло", 89, "шарманщик");
        System.out.println(admin.getStatus());
    }
}
