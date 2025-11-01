package ru.stream.mapto;

import java.util.*;
import java.util.stream.Stream;

public class FlatMapToIntExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        List<Integer> list = Stream.of(array1, array2, array3)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .toList();
        System.out.println(list);
    }
}
