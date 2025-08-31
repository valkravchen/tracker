package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("Исходный список: " + numbers);
        System.out.println("\n1. Классический for:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("  Индекс " + i + ": " + numbers.get(i));
        }
        System.out.println("\n2. Enhanced for:");
        for (Integer number : numbers) {
            System.out.println("  Число: " + number);
        }
        System.out.println("\n3. Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("  Через iterator: " + number);
        }
        System.out.println("\n4. ListIterator (назад):");
        ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());
        while (listIterator.hasPrevious()) {
            Integer number = listIterator.previous();
            System.out.println("  С конца: " + number);
        }
        System.out.println("\n5. Streams:");
        numbers.stream()
                .forEach(number -> System.out.println("  Stream: " + number));
    }
}
