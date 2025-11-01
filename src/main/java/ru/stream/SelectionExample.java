package ru.stream;

import java.util.*;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> result = strings
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println(result);
    }
}
