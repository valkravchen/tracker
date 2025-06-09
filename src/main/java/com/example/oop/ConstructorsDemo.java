package com.example.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        User user = new User("Емеля", 25);
        System.out.println("Начальное состояние: " +
                user.getName() + ", " +
                user.getAge());
    }
}
