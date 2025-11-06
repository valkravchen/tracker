package ru.stream.attestation;

import java.util.*;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .map(Pupil::subjects)
                .flatMap(Collection::stream)
                .mapToInt(Subject::score)
                .average()
                .orElse(0.0);
    }

}
