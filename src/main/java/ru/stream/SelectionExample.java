package ru.stream;

import java.util.*;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> result = Collections.singletonList(strings
                .stream()
                .skip(strings.size() - 1)
                .findFirst()
                .orElse("По умолчанию"));
        System.out.println(result);
    }
}
