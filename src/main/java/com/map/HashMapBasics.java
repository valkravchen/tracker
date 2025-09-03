package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        System.out.println("=== ОСНОВНЫЕ ОПЕРАЦИИ HASHMAP ===\n");
        ages.put("Алексей", 25);
        ages.put("Елена", 30);
        ages.put("Дмитрий", 28);
        ages.put("Анна", 22);
        System.out.println("Возрасты: " + ages);
        System.out.println("Размер карты: " + ages.size());
        Integer alexAge = ages.get("Алексей");
        System.out.println("Возраст Алексея: " + alexAge);
        boolean hasElena = ages.containsKey("Елена");
        boolean hasAge25 = ages.containsValue(25);
        System.out.println("Есть ключ 'Елена': " + hasElena);
        System.out.println("Есть возраст 25: " + hasAge25);
        Integer oldAge = ages.put("Алексей", 26);
        System.out.println("Старый возраст Алексея: " + oldAge);
        System.out.println("Новые возрасты: " + ages);
        Integer unknownAge = ages.getOrDefault("Неизвестный", 0);
        System.out.println("Возраст неизвестного: " + unknownAge);
        Integer removedAge = ages.remove("Дмитрий");
        System.out.println("Удалён Дмитрий с возрастом: " + removedAge);
        System.out.println("Финальные возрасты: " + ages);
    }
}
