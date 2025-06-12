package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Мухтар", 18);
        System.out.println(user.getGreeting());
        user.celebrateBirthday();
    }
}
