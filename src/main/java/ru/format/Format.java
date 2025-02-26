package ru.format;

public class Format {

    public static void getGreeting(String name) {
        System.out.format("Строка1%nСтрока2");
    }

    public static void main(String[] args) {
        getGreeting("Елена");
    }
}
