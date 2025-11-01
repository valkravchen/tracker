package ru.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 2, 1, 8, 3, 5);
        List<Integer> resultNumbers = numbers.stream()
                .distinct()
                .sorted()
                .filter(number -> number > 2)
                .map(number -> number * number)
                .toList();
        List<String> names = List.of("Anna", "Boris", "anna", "Charlie", "Boris", "Diana");
        List<String> resultNames = names.stream()
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .filter(name -> name.length() > 4)
                .toList();

        System.out.println(resultNumbers);
        System.out.println(resultNames);
        List<Person> people = List.of(
                new Person("Name1", 18),
                new Person("Name2", 19),
                new Person("Name3", 18),
                new Person("Name4", 20),
                new Person("Name1", 18),
                new Person("Name2", 19)
        );
        List<String> resultPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .distinct()
                .map(Person::getName).toList();

        System.out.println(resultPeople.toString());

        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        System.out.println(matrix.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
        );
    }
}
