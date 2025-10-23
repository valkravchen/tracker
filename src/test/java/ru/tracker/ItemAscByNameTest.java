package ru.tracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class ItemAscByNameTest {

    @Test
    public void whenSortAscByName() {
        List<Item> items = Arrays.asList(
                new Item(3, "В"),
                new Item(1, "А"),
                new Item(2, "Б")
        );
        items.sort(new ItemAscByName());

        List<Item> expected = Arrays.asList(
                new Item(1, "А"),
                new Item(2, "Б"),
                new Item(3, "В")
        );

        Assertions.assertEquals(expected, items);
    }
}