package com.com.example;

public class Demo {
    public static void main(String[] args) {
        System.out.println(User.getIdCounter());
        System.out.println(PremiumUser.getIdCounter());
        User user = new User("Кузя", 3);
        System.out.println(user.getIdCounter());
    }
}
