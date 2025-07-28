package com.example.oop._53_string_experiment2;

public class StringBuilderDemo {
    void demonstrateBuilderMethods() {
        StringBuilder builder = new StringBuilder("исходная-строка");
        System.out.println("1. Начальное состояние: " + builder.toString());
        builder.append("-добавленный-текст");
        System.out.println("2. После append: " + builder.toString());
        builder.insert(8, "-вставленный");
        System.out.println("3. После insert в позицию 8: " + builder.toString());
        builder.delete(8, 20);
        System.out.println("4. После delete с 8 по 19: " + builder.toString());
        builder.reverse();
        System.out.println("5. После reverse: " + builder.toString());
        builder.setLength(15);
        System.out.println("6. После setLength(15): " + builder.toString());
    }

    void demonstrateStringBuffer() {
        StringBuffer buffer = new StringBuffer("потокобезопасная-строка");
        System.out.println("StringBuffer начальное состояние: " + buffer.toString());
        buffer.append("-синхронизированное").append("-добавление");
        System.out.println("StringBuffer после операций: " + buffer.toString());
        System.out.println("Емкость буфера: " + buffer.capacity());
        System.out.println("Длина содержимого: " + buffer.length());
    }

    public static void main(String[] args) {
        StringBuilderDemo demo = new StringBuilderDemo();
        System.out.println("=== Демонстрация StringBuilder ===");
        demo.demonstrateBuilderMethods();
        System.out.println("=== Демонстрация StringBuffer ===");
        demo.demonstrateStringBuffer();
    }
}
