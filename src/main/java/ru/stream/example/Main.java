package ru.stream.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, 5, -1, 8, 0, 2, -7);
        System.out.println("Все числа: " + numbers);
        List<Integer> positive = numbers
                .stream()
                .filter(number -> number > 0)
                .toList();
        System.out.println("Положительные: " + positive);

        List<String> words = List.of("Java", "Go", "Python", "C", "Rust");
        System.out.println("Все слова: " + words);
        List<String> longWords = words
                .stream()
                .filter(word -> word.length() > 3)
                .toList();
        System.out.println("Длинные слова: " + longWords);
    }
}
