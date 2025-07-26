package com.example.oop._47_decoratorPattern_experiment_withoutPattern;

import com.example.oop._47_decoratorPattern_experiment_withPattern.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРОЦЕСС 1: РЕШЕНИЕ БЕЗ ПАТТЕРНА ===");
        System.out.println("ЗАДАЧА: Добавить Cinnamon во все комбинации");
        System.out.println("ШАГ 1: Анализ - нужны классы: Cinnamon, MilkCinnamon, SugarCinnamon, MilkSugarCinnamon");
        System.out.println("ШАГ 2: Создаю CoffeeWithCinnamonV1");
        CoffeeWithCinnamonV1 coffeeWithCinnamonV1 = new CoffeeWithCinnamonV1();
        System.out.println(coffeeWithCinnamonV1.getDescription() + " - " + coffeeWithCinnamonV1.getCost() + "₽");
        System.out.println("ШАГ 3: Создаю CoffeeWithMilkAndCinnamonV1");
        CoffeeWithMilkAndCinnamonV1 coffeeWithMilkAndCinnamonV1 = new CoffeeWithMilkAndCinnamonV1();
        System.out.println(coffeeWithMilkAndCinnamonV1.getDescription() + " - " +
                coffeeWithMilkAndCinnamonV1.getCost() + "₽");
        System.out.println("ШАГ 4: Создаю CoffeeWithSugarAndCinnamonV1");
        CoffeeWithMilkSugarAndCinnamonV1 coffeeWithMilkSugarAndCinnamonV1 = new CoffeeWithMilkSugarAndCinnamonV1();
        System.out.println(coffeeWithMilkSugarAndCinnamonV1.getDescription() + " - " +
                coffeeWithMilkSugarAndCinnamonV1.getCost() + "₽");
        System.out.println("РЕЗУЛЬТАТ ПРОЦЕССА 1: Было 4 класса → стало 8 классов");
        System.out.println();
        System.out.println("=== ПРОЦЕСС 2: РЕШЕНИЕ С ПАТТЕРНОМ ===");
        System.out.println("ШАГ 1: Рефакторим существующий код в паттерн Декоратор");
        System.out.println("ШАГ 2: Создаю CinnamonDecoratorV2 - ОДИН класс для всех комбинаций");
        CoffeeV2 coffeeV2 = new SimpleCoffeeV2();
        CoffeeV2[] coffeeV2s = {
                new CinnamonDecoratorV2(coffeeV2),
                new MilkDecoratorV2(new CinnamonDecoratorV2(coffeeV2)),
                new SugarDecoratorV2(new CinnamonDecoratorV2(coffeeV2)),
                new MilkDecoratorV2(new SugarDecoratorV2(new CinnamonDecoratorV2(coffeeV2)))

        };
        for (CoffeeV2 coffeeV3 : coffeeV2s) {
            System.out.println(coffeeV3.getDescription() + " - " + coffeeV3.getCost());
        }
    }
}
