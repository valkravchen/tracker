package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Шурик", 21);
        User user2 = new User("Ералаш", 15);
        User user3 = new User("Каламбур", 55);
        user3.setActive(false);
        System.out.println(user1.getUserStatus());
        System.out.println(user2.getUserStatus());
        System.out.println(user3.getUserStatus());
    }
}
