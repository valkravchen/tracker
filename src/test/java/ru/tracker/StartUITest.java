package ru.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class StartUITest {

    @Test
    void whenAddItem() {
      Input input = new ConsoleInput();
      Tracker tracker = new Tracker();
      StartUI.createItem(input, tracker);
      Item created = tracker.findAll()[0];
      Item expected = new Item("Fix PC");
      assertThat(created.getName()).isEqualTo(expected.getName());
    }
}