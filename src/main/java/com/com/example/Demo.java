package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Шурик", 21);
        user.setName("Шурик Ы");
        user.setAge(22);
        user.setActive(false);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.isActive());
    }
}
