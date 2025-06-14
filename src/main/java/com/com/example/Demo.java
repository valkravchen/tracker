package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Пионер", 9);
        User user2 = new User("Октябрёнок", 7);
        User user3 = new User("Буба Касторский", 61);
        System.out.println(user1.getPersonalizedGreeting());
        System.out.println(user2.getPersonalizedGreeting());
        System.out.println(user3.getPersonalizedGreeting());
        System.out.println(user3.isEligibleForDiscount());
    }
}