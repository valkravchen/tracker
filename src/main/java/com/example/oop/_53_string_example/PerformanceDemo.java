package com.example.oop._53_string_example;

public class PerformanceDemo {
    void demonstratePerformance(int iterations) {
        System.out.println("Тест производительности для " + iterations + " итераций:");
        long startTime = System.currentTimeMillis();
        String result1 = "";
        for (int i = 0; i < iterations; i++) {
            result1 += "строка-" + i + " ";
        }
        long stringTime = System.currentTimeMillis() - startTime;
        stringTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("строка-").append(i).append(" ");
        }
        String result2 = stringBuilder.toString();
        System.out.println(result2);
        long builderTime = System.currentTimeMillis() - startTime;

        System.out.println("String конкатенация: " + stringTime + " мс");
        System.out.println("StringBuilder: " + builderTime + " мс");
    }

    public static void main(String[] args) {
        PerformanceDemo demo = new PerformanceDemo();
        demo.demonstratePerformance(33);
    }
}
