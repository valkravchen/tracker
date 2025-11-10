package ru.stream.attestation;

import java.util.*;
import java.util.stream.*;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(0.0);
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), averageScore(pupil)))
                .toList();
    }

    private static double averageScore(Pupil pupil) {
        return pupil.subjects().stream()
                .mapToInt(Subject::score)
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.averagingDouble(Subject::score)
                ))
                .entrySet()
                .stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .toList();
    }

    public static Optional<Tuple> bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), totalScore(pupil)))
                .max(Comparator.comparingDouble(Tuple::score));
    }

    private static int totalScore(Pupil pupil) {
        return pupil.subjects().stream()
                .mapToInt(Subject::score)
                .sum();
    }

    public static Optional<Tuple> bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.summingInt(Subject::score)
                ))
                .entrySet()
                .stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .max(Comparator.comparingDouble(Tuple::score));
    }
}//


