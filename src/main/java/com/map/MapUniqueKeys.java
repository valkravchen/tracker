package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapUniqueKeys {
    public static void main(String[] args) {
        Map<String, String> colors = new HashMap<>();
        colors.put("R", "Красный");
        colors.put("G", "Зелёный");
        colors.put("B", "Синий");
        colors.put("R", "Алый");
        System.out.println(colors);
        colors.put("C", "Синий");
        System.out.println("Одинаковые значения разрешены: " + colors);
    }
}
