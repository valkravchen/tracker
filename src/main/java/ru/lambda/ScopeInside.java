package ru.lambda;

import java.util.function.Supplier;

public class ScopeInside {
//    private static String first = "Гав";
//    private static String second = "Муу";

    public static void main(String[] args) {
        String ayyyy = "ayyyyy";
        ayyyy = "aaaaa";
        String temp = ayyyy;
        String name = echo(() -> temp);
        System.out.println(ayyyy);
        System.out.println(name);
    }

    public static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }
}
