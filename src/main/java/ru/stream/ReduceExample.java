package ru.stream;

import java.util.*;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        Optional<Integer> sum = numbers.stream()
                        .reduce(Integer::sum);
        System.out.println(sum.get());

        List<String> nums = List.of("Один", "Два", "Три");
        Optional<String> sum1 = nums.stream()
                .reduce((left, right) -> left + ", " + right);
        System.out.println(sum1.get());
        int sum2 = numbers.stream()
                .reduce(2, (a, b) -> a + b);
        System.out.println(sum2);
    }
}
