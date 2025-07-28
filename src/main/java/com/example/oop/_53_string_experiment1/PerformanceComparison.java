package com.example.oop._53_string_experiment1;

public class PerformanceComparison {
    void compareStringBuilding(int iterations) {
        System.out.println("Сравнение производительности построения строк (" + iterations + " итераций):");
        String result = "начальная строка";
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < iterations; i++) {
            result += "-элемент-" + i;
        }
        long stringTime = System.currentTimeMillis() - startTime;
        StringBuilder builder = new StringBuilder("начальная строка");
        startTime = System.currentTimeMillis();
        for (int i = 1; i < iterations; i++) {
            builder.append("-элемент-").append(i);
        }
        String builderResult = builder.toString();
        long builderTime = System.currentTimeMillis() - startTime;
        System.out.println("String конкатенация: " + stringTime +
                "  мс, результат содержит " + result.length() + " символов");
        System.out.println("StringBuilder: " + builderTime +
                " мс, результат содержит " + builderResult.length() + " символов");
        if (builderTime > 0) {
            System.out.println("Ускорение: " + (stringTime / builderTime) + "x");
        }
    }

    public static void main(String[] args) {
        PerformanceComparison comparison = new PerformanceComparison();
        comparison.compareStringBuilding(1000);
    }
}
