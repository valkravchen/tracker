package ru.stream;

import java.util.*;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-25, 88, 68999, 0, -6, 5);
        List<Integer> positive = numbers.stream().filter(
                number -> number > 0
        ).toList();
        positive.forEach(System.out::println);
    }
}
