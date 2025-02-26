package ru.format;

public class Format {

    public static void getGreeting(String name) {
        System.out.println(String.format("Ja%ca", 'v'));
    }

    public static void main(String[] args) {
        getGreeting("Елена");
    }
}
