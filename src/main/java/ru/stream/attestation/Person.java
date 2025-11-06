package ru.stream.attestation;

import java.util.List;

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

        List<String> names = persons.stream()
                .map(Person::getName)
                .toList();
        System.out.println("Имена: " + names);

        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9)
        );
        System.out.println("Матрица:");
        System.out.println(matrix);
        matrix.forEach(row -> System.out.println("  " + row));
//        List<Integer> flat =
    }
}
