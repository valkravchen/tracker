package com.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NumberTreeSet {
    public static void main(String[] args) {
        NavigableSet<Double> temperatures = new TreeSet<>();
        temperatures.add(23.5);
        temperatures.add(18.2);
        temperatures.add(31.7);
        temperatures.add(12.0);
        temperatures.add(27.3);
        System.out.println("=== ТЕМПЕРАТУРЫ ЗА НЕДЕЛЮ ===\n");
        System.out.println("Все температуры: " + temperatures);
        System.out.println("\nАнализ температур:");
        System.out.println("Минимальная: " + temperatures.first() + "°C");
        System.out.println("Максимальная: " + temperatures.last() + "°C");
        double threshold = 20.0;
        System.out.println("\nТемпературы выше " + threshold + "°C:");
        NavigableSet<Double> warmDays = temperatures.tailSet(threshold, true);
        for (Double temp : warmDays) {
            System.out.println("  " + temp + "°C");
        }
    }
}
