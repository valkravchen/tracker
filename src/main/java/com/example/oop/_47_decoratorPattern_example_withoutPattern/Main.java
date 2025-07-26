package com.example.oop._47_decoratorPattern_example_withoutPattern;

public class Main {
    public static void main(String[] args) {
        SimpleText simpleText = new SimpleText();
        BoldText boldText = new BoldText();
        BoldItalicText boldItalicText = new BoldItalicText();
        System.out.println(simpleText.render());
        System.out.println(boldText.render());
        System.out.println(boldItalicText.render());
    }
    // Проблемы:
// 1. Нужен отдельный класс для каждой комбинации
// 2. Дублирование логики
// 3. Невозможно добавить новые форматы без изменения кода
// 4. Увеличение количества классов при добавлении новых опций
}
