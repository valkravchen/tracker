package ru.format;

public class Format {

    public static void getGreeting(String name) {
        System.out.println(String.format("Аргумент передан? %b", 55));
    }

    public static void main(String[] args) {
        getGreeting("Елена");
    }
}
