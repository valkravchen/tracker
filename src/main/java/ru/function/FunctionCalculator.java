package ru.function;

import java.util.*;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(function.apply((double) i));
        }
        return result;
    }
}
