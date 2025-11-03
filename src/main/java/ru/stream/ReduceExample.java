package ru.stream;

import java.util.*;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        Optional<Integer> sum = numbers.stream().
                reduce(Integer::sum);
        System.out.println(sum.get());
    }
}
