package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class CitiesHomework {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Вашингтон", "Сан-Франциско", "Майами",
                "Чикаго", "Вашингтон"));
        System.out.println("=== СПИСОК ГОРОДОВ ===");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("Индекс " + i + ": " + cities.get(i));
        }
        System.out.println("Размер списка: " + cities.size());
        int indexChicago = cities.indexOf("Чикаго");
        System.out.println("Индекс Чикаго: " + indexChicago);
        System.out.println("Список до изменения: " + cities);
        cities.set(4, "Даллас");
        System.out.println("Список после изменения: " + cities);
        cities.remove(0);
        System.out.println("После удаления по индексу: " + cities);
        cities.remove("Чикаго");
        System.out.println("После удаления по значению: " + cities);
    }
}
