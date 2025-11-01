package ru.stream;

import java.util.*;

public class MapToIntExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        strings.stream()
                .mapToInt(Integer::parseInt)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
