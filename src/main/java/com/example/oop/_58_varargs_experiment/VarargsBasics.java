package com.example.oop._58_varargs_experiment;

public class VarargsBasics {
    static int calculateSum(String operation, int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Сумма без чисел для операции operation: 0");
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма varargs-чисел для операции " + operation + ": " +
                sum + " из " + numbers.length + " элементов");
        return sum;
    }

    static void demonstrateFlexibility() {
        System.out.println("Демонстрация гибкости varargs:");
        calculateSum("без-аргументов");
        calculateSum("один-аргумент", 42);
        calculateSum("три-аргумента", 10, 20, 30);
        int[] array = {5, 15, 25, 35};
        calculateSum("массив-как-varargs", array);
    }

    static void processStrings(String prefix, String... words) {
        System.out.println("Обработка строк с префиксом: " + prefix);
        if (words.length == 0) {
            System.out.println("Нет слов для обработки");
        } else {
            for (int i = 0; i < words.length; i++) {
                System.out.println("Слово " + (i + 1) + ": " + prefix +
                        "-" + words[i]);
            }
        }
    }

    public static void main(String[] args) {
        VarargsBasics.demonstrateFlexibility();
        VarargsBasics.processStrings("префикс", "первое", "второе", "третье");
        VarargsBasics.processStrings("пустой-префикс");
    }
}
