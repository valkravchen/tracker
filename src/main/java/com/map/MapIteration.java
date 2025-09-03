package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Игра1", 1500);
        scores.put("Игра2", 2300);
        scores.put("Игра3", 1800);
        System.out.println("=== ТРИ СПОСОБА ИТЕРАЦИИ ===\n");
        System.out.println("1. По ключам:");
        for (String game : scores.keySet()) {
            System.out.println("Игра " + game + ", очки:" + scores.get(game));
        }
        System.out.println("\n2. По значениям:");
        for (Integer score : scores.values()) {
            System.out.println("Результат: " + score);
        }
        System.out.println("\n3. По парам (лучший способ):");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Игра: " + entry.getKey() + " = " + entry.getValue() + " очков");
        }
    }
}
