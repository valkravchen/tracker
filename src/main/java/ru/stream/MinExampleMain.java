package ru.stream;

import ru.stream.mapto.Person;

import java.util.*;

public class MinExampleMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));
        int minAge = youngestPerson.get().getAge();
        System.out.println(minAge);
    }
}
