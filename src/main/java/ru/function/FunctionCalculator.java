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

    public static void main(String[] args) {
        FunctionCalculator calc = new FunctionCalculator();
        System.out.println(calc.diapason(5, 8, x -> 2 * x + 1));
        System.out.println(calc.diapason(1, 4, x -> x * x));
        System.out.println(calc.diapason(0, 3, x -> Math.pow(2, x)));
    }
}
