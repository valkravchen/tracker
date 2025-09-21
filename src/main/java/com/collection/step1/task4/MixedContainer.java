package com.collection.step1.task4;

import java.util.Arrays;

public class MixedContainer {
    private Object[] items;
    private int size;
    private int instanceOfCount = 0;

    public MixedContainer() {
        items = new Object[5];
        size = 0;
    }

    public void add(Object item) {
        if (size >= items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }
        items[size++] = item;
    }

    public String[] getStrings() {
        String[] strings = new String[size]; // Используем size, а не items.length
        int count = 0;
        for (int i = 0; i < size; i++) { // Итерируем только до size
            instanceOfCount++; // Увеличиваем счетчик ДО проверки
            if (items[i] instanceof String) {
                strings[count++] = (String) items[i];
            }
        }
        return Arrays.copyOf(strings, count);
    }

    public int sumIntegers() {
        int sum = 0;
        for (int i = 0; i < size; i++) { // Итерируем только до size
            instanceOfCount++; // Увеличиваем счетчик перед проверкой instanceof
            if (items[i] instanceof Integer) {
                sum += (Integer) items[i];
            }
        }
        return sum;
    }

    public void demonstrateCastingProblem() {
        try {
            // Пытаемся привести элемент с индексом 1 (Integer) к String
            String str = (String) items[1];
            System.out.println("Успешно привели к String: " + str);
        } catch (ClassCastException e) {
            System.out.println("Ошибка приведения типа: " + e.getMessage());
            System.out.println("Попытка привести " + items[1].getClass().getSimpleName() +
                    " к String привела к ClassCastException");
        }
    }

    public int getInstanceOfCount() {
        return instanceOfCount;
    }

    public static void main(String[] args) {
        MixedContainer container = new MixedContainer();
        container.add("Hello World");
        container.add(Integer.valueOf(42));
        container.add(Double.valueOf(3.14159));
        container.add(new java.util.Date());
        container.add(Boolean.TRUE);
        container.add("Another String");
        container.add(Integer.valueOf(100));
        container.add(null);
        String[] strings = container.getStrings();
        System.out.println("Строки в контейнере: " + Arrays.toString(strings));
        System.out.println("Количество строк: " + strings.length);
        int sum = container.sumIntegers();
        System.out.println("Сумма целых чисел: " + sum);
        System.out.println("\nДемонстрация проблемы приведения типов:");
        container.demonstrateCastingProblem();
        System.out.println("\nКоличество проверок instanceof: " + container.getInstanceOfCount());
    }
}
