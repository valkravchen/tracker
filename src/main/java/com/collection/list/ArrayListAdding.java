package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAdding {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Москва");
        cities.add("Санкт-Петербург");
        cities.add("Новосибирск");
        System.out.println("После add(): " + cities);
        cities.add(1, "Екатеринбург");
        System.out.println("После add(1, элемент): " + cities);
        List<String> moreCities = Arrays.asList("Казань", "Нижний Новгород");
        cities.addAll(moreCities);
        System.out.println("После addAll(): " + cities);
        List<String> siberian = Arrays.asList("Омск", "Красноярск");
        cities.addAll(3, siberian);
        System.out.println("После addAll(3, коллекция): " + cities);
        System.out.println("Итоговый размер: " + cities.size());
    }
}
