package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Петя", 18);
        System.out.println(user.getFullInfo());
        user.setName("Новый Петя");
        System.out.println(user.getFullInfo());
    }
}
