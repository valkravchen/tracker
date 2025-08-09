package ru.tracker;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TrackerTest {
    @Test
    public void whenTestFindById() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        Item item = tracker.add(bug);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName()).isEqualTo(item.getName());
    }

    @Test
    public void whenTestFindAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        List<Item> result = tracker.findAll();
        assertThat(result.get(0).getName()).isEqualTo("First");
        assertThat(result.get(1).getName()).isEqualTo("Second");
    }

    @Test
    public void whenTestFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("First");
        tracker.add(item);
        List<Item> result = tracker.findByName("First");
        assertThat(result.get(0).getName()).isEqualTo("First");
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        int id = item.getId();
        Item newItem = new Item("New Item");
        boolean result = tracker.replace(id, newItem);
        assertThat(result).isTrue();
        assertThat(tracker.findById(id).getName()).isEqualTo("New Item");
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        int id = item.getId();
        boolean result = tracker.delete(id);
        assertThat(result).isTrue();
        assertThat(tracker.findById(id)).isNull();
    }
}

