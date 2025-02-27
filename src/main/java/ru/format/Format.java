package ru.format;

import java.util.Calendar;

public class Format {

    public static void getGreeting(String name) {
        System.out.println(String.format("Задаем число 0.99 - %.2f", 0.99));
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, текущее время: %tT", name, instance, instance));
    }
}

