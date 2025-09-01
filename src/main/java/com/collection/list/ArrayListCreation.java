package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreation {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        System.out.println("Пустой список: " + list1);
        List<String> list2 = new ArrayList<>(50);
        System.out.println("Список с ёмкостью 50: " + list2);
        List<String> source = Arrays.asList("Java", "Python", "C++");
        List<String> list3 = new ArrayList<>(source);
        System.out.println("Список из другого списка: " + list3);
        List<String> list4 = new ArrayList<>(List.of("HTML", "CSS", "JavaScript"));
        System.out.println("Список с начальными элементами: " + list4);
        List<String> list5 = new ArrayList<>(Arrays.asList("Git", "Docker", "Kubernetes"));
        System.out.println("Через Arrays.asList: " + list5);
    }
}
