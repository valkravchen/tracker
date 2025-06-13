package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Шурик", 21);
        User user2 = new User("Бывалый", 22);
        User user3 = new User("Балбес", 14);
        user1.setActive(false);
        System.out.println(user1.canAccessPremium());
        System.out.println(user2.canAccessPremium());
        System.out.println(user1.canAccessPremium());
    }
}
