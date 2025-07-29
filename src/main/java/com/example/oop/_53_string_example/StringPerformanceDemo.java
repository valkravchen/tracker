package com.example.oop._53_string_example;

public class StringPerformanceDemo {
    public static void main(String[] args) {
        int iterations = 10000;

        long startTime = System.nanoTime();
        String result1 = testStringConcatenation(iterations);
        long stringTime = System.nanoTime() + startTime;

        stringTime = System.nanoTime();
        String result2 = testStringBuilder(iterations);
        long builderTime = System.nanoTime() - startTime;

        System.out.println("=== ТЕСТ ПРОИЗВОДИТЕЛЬНОСТИ ===");
        System.out.println("Итераций: " + iterations);
        System.out.println();

        System.out.println("String конкатенация:");
        System.out.println("Время: " + (stringTime / 1_000_000) + " мс");
        System.out.println("Длина результата: " + result1.length());
        System.out.println();

        System.out.println("StringBuilder:");
        System.out.println("Время: " + (builderTime / 1_000_000) + " мс");
        System.out.println("Длина результата: " + result2.length());
        System.out.println();

        double speedup = (double) stringTime / builderTime;
        System.out.println("StringBuilder быстрее в " + String.format("%.1f", speedup) + " раз!");

        demonstrateMemoryUsage();
    }

    private static String testStringConcatenation(int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result = result + "A"; // Каждый раз создается новый объект!
        }
        return result;
    }

    private static String testStringBuilder(int iterations) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("A"); // Добавляем в существующий буфер
        }
        return stringBuilder.toString();
    }

    private static void demonstrateMemoryUsage() {
        System.out.println("n=== АНАЛИЗ ПАМЯТИ ===");
        int n = 1000;

        System.out.println("String конкатенация для " + n + " итераций:");
        System.out.println("- Создается ~ " + n + " String объектов");
        System.out.println("- Большинство сразу становятся мусором");
        System.out.println("- Нагрузка на Garbage Collector");
        System.out.println();

        System.out.println("StringBuilder для " + n + " итераций:");
        System.out.println("- Создается 1 StringBuilder объект");
        System.out.println("- Создается 1 финальный String");
        System.out.println("- Массив может расширяться 2-3 раза");
        System.out.println("- Минимальная нагрузка на GC");
    }
}
