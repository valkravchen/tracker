package ru.stream;

import ru.stream.mapto.Person;

import java.util.*;

public class ReduceExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum = people.stream()
                .reduce(0,
                        (left, right) -> {
                            if (right.getAge() > 25) {
                                return left + right.getAge();
                            } else {
                                return left;
                            }
                        },
                        (left, right) -> left + right
                );
        System.out.println(sum);

        int min = people.parallelStream()
                .reduce(
                        0,
                        (left, right) -> left + right.getAge(),
                        Integer::min
                );
        System.out.println(min);
    }
}
