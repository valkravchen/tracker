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

        List<String> words1 = List.of("Java", "Go", "Python", "C", "Rust");
        System.out.println("Все слова: " + words1);
        List<String> longWords = words1
                .stream()
                .filter(word -> word.length() > 3)
                .toList();
        System.out.println("Длинные слова: " + longWords);

        List<String> words2 = List.of("java", "stream", "api");
        System.out.println("Исходные слова: " + words2);
        List<Integer> lengths = words2
                .stream()
                .map(String::length)
                .toList();
        System.out.println("Длины слов: " + lengths);

        List<String> words3 = List.of("java", "stream", "api");
        System.out.println("До: " + words3);
        List<String> upper = words3
                .stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("После: " + upper);

        List<Integer> numbers2 = List.of(10, 20, 30, 40, 50);
        System.out.println("Числа: " + numbers2);

        int sum = numbers2
                .stream()
                .mapToInt(number -> number)
                .sum();
        System.out.println("Сумма: " + sum);

        double avg = numbers2
                .stream()
                .mapToInt(number -> number)
                .average()
                .orElse(0.0);
        System.out.println("Среднее: " + avg);

        int max = numbers2
                .stream()
                .mapToInt(number -> number)
                .max()
                .orElse(0);
        System.out.println("Максимум: " + max);

        int min = numbers2
                .stream()
                .mapToInt(number -> number)
                .min()
                .orElse(0);

        System.out.println("Минимум: " + min);

        long count = numbers2
                .stream()
                .count();

        System.out.println("Количество: " + count);
    }
}
