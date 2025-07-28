package com.example.oop._53_string_experiment3;

import java.util.StringJoiner;

public class StringJoinerDemo {
    void demonstrateBasicJoining() {
        StringJoiner basicJoiner = new StringJoiner(", ");
        basicJoiner.add("первый-элемент").add("второй-элемент").add("третий-элемент");
        System.out.println("Базовое объединение: " + basicJoiner.toString());
    }

    void demonstrateFormattedJoining() {
        StringJoiner formattedJoiner = new StringJoiner(" | ", "[Список: ", "]");
        String[] items = {"пункт-А", "пункт-Б", "пункт-В", "пункт-Г"};
        for (String item : items) {
            formattedJoiner.add(item);
        }
        System.out.println("Форматированное объединение: " + formattedJoiner.toString());
    }

    void demonstrateEmptyHandling() {
        StringJoiner emptyJoiner = new StringJoiner(", ", "{", "}");
        System.out.println("Пустой StringJoiner: " + emptyJoiner.toString());
        emptyJoiner.setEmptyValue("нет-элементов");
        System.out.println("С значением по умолчанию: " + emptyJoiner.toString());
        emptyJoiner.add("появился-элемент");
        System.out.println("После добавления элемента: " + emptyJoiner.toString());
    }

    void demonstrateJoinerMerging() {
        StringJoiner joiner1 = new StringJoiner(", ", "(", ")");
        joiner1.add("группа-1-элемент-1").add("группа-1-элемент-2");
        System.out.println(joiner1.toString());
        StringJoiner joiner2 = new StringJoiner("; ", "[", "]");
        joiner2.add("группа-2-элемент-1").add("группа-2-элемент-2");
        StringJoiner mergedJoiner = new StringJoiner(" + ").merge(joiner1).merge(joiner1);
        System.out.println("Объединение StringJoiner'ов: " + mergedJoiner.toString());
    }

    public static void main(String[] args) {
        StringJoinerDemo demo = new StringJoinerDemo();
        demo.demonstrateBasicJoining();
        demo.demonstrateFormattedJoining();
        demo.demonstrateEmptyHandling();
        demo.demonstrateJoinerMerging();
    }
}
