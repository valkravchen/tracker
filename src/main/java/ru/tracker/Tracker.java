package ru.tracker;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tracker tracker = (Tracker) o;
        return ids == tracker.ids && size == tracker.size && Arrays.equals(items, tracker.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(items), ids, size);
    }

    public Item[] findByName(String key) {
       Item[] result = new Item[size];
       int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null && key.equals(item.getName())) {
                result[count++] = item;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
}

