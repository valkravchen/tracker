package com.example.oop.interfaces_28.experiment1;

public class UpperCaseFormatter implements Formatter {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }

    public static void main(String[] args) {
        Formatter formatter = new UpperCaseFormatter();
        System.out.println("Обычное форматирование: " + formatter.format("hello"));
        System.out.println("С квадратными скобками: " + formatter.formatWithBrackets("hello"));
        System.out.println("Множественное форматирование: " + formatter.formatMultiple("hello", "world"));
    }
}
