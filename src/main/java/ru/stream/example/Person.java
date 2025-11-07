package ru.stream.example;

import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Иван", 25),
                new Person("Мария", 30),
                new Person("Пётр", 22)
        );

        System.out.println("Люди: " + persons);

        List<String> names = persons
                .stream()
                .map(Person::getName)
                .toList();

        System.out.println("Имена: " + names);
    }
}
