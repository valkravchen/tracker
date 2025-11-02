package ru.stream;

import ru.stream.mapto.Person;

import java.util.*;

public class MaxExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        Optional<Person> oldestPerson = people.stream()
                .max(Comparator.comparing(Person::getAge));
        int oldestAge = oldestPerson.get().getAge();
        System.out.println(oldestAge);
    }
}
