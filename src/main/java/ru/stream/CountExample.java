package ru.stream;

import java.util.*;

import java.util.stream.*;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(sum);
    }
}
