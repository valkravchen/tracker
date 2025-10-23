package ru.tracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class ItemDescByNameTest {
    @Test
    public void whenSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "Apple"),
                new Item(3, "Zebra"),
                new Item(2, "Mango")
        );
        items.sort(new ItemDescByName());

        List<Item> expected = Arrays.asList(
                new Item(3, "Zebra"),
                new Item(2, "Mango"),
                new Item(1, "Apple")
        );

        Assertions.assertEquals(expected, items);
    }
}