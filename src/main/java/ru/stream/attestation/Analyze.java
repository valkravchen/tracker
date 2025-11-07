package ru.stream.attestation;

import java.util.*;
import java.util.stream.*;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .map(Pupil::subjects)
                .flatMap(Collection::stream)
                .mapToInt(Subject::score)
                .average()
                .orElse(0.0);
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(
                        pupil.name(),
                        pupil.subjects()
                                .stream()
                                .mapToInt(Subject::score)
                                .average()
                                .orElse(0D)
                )).toList();
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
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(
                        pupil.name(),
                        pupil.subjects().stream()
                                .mapToInt(Subject::score)
                                .sum()
                ))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(new Tuple("", 0D));
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.summingInt(Subject::score)
                ))
                .entrySet()
                .stream()
                .map(entry-> new Tuple(entry.getKey(), entry.getValue()))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(new Tuple("", 0.0));
    }
}


