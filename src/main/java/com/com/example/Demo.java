package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Мухтар", 18);
        int birthYear = user.calculateBirthYear(2025);
        System.out.println("Год рождения пользователя: " + birthYear);
        System.out.println("Пользователь совершеннолетний? " + user.isAdult());
    }
}
