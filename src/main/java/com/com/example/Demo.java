package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Буратино", 10);
        user.setDetailsWrong("Параметр", 13);
        System.out.println("Значение поля name = " + user.getName() +
                "; значение поля age = " + user.getAge());
    }
}