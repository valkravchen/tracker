package ru.stream;

import java.util.*;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bounds) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .filter(value -> value.getScore() >= bounds)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .toList();
    }
}
