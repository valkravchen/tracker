package ru.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StartUITest {

    @Test
    void whenCreateItem() {
        Input input = new MockInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("Первая заявка"));
        Item item2 = tracker.add(new Item("Вторая заявка"));
        Item item3 = tracker.add(new Item("Третья заявка"));
        Input input = new MockInput(new String[]{"0", String.valueOf(item1.getId()), "Замена первой заявки", "1"
        });
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Замена первой заявки");
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("Первая заявка"));
        Item item2 = tracker.add(new Item("Вторая заявка"));
        Item item3 = tracker.add(new Item("Третья заявка"));
        Input input = new MockInput(new String[]{"0", String.valueOf(item2.getId()), "1"});
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        Item deleted = tracker.findById(item2.getId());
        assertThat(deleted).isNull();
    }
}



