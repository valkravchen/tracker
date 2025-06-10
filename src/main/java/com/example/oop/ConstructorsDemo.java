package com.example.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        User user = new User("Кощей");
        System.out.println(user.getName() + ", " + user.getAge());
        System.out.println("Счётчик: " + User.getIdCounter());
    }
}
