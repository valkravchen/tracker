package com.example.oop;

public class FieldsDemo {
    public static void main(String[] args) {
        User user1 = new User("Иван", 19);
        System.out.println(user1.getName());
        user1 = user1.setName("Александр");
        System.out.println(user1.getName());
    }
}
