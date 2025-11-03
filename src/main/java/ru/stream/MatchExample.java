package ru.stream;

import java.util.*;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        boolean result = strings
                .stream()
                .anyMatch(element -> element.endsWith("ь"));
        System.out.println(result);
    }
}
