package ru.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                result[count++] = item;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return (index != -1) ? items[index] : null;
    }

    private int indexOf(int id) {
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                return index;
            }
        }
        return -1;
    }

    public boolean replace(int id, Item item) {
        if (id <= 0) {
            System.out.println("ID должен быть положительным числом!");
            return false;
        }
        if (item == null) {
            System.out.println("Item не может быть null!");
            return false;
        }
        int index = indexOf(id);
        if (index == -1) {
            System.out.println("Элемент с таким ID не найден!");
            return false;
        }
        item.setId(id);
        items[index] = item;
        return true;
    }

    public void delete(int id) {
        if (id <= 0) {
            System.out.println("Ошибка: ID должен быть положительным числом!");
        } else {
            int index = indexOf(id);
            if (index == -1) {
                System.out.println("Ошибка: Элемент с таким ID не найден!");
            } else {
                System.arraycopy(items, index + 1, items, index, size - index - 1);
                items[size - 1] = null;
                size--;
            }
        }
    }
}



