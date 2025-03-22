package ru.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class StartUITest {

    @Test
    void whenExit() {
        Output output = new MockOutput();
        Input input = new MockInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction(output)};
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isEqualTo("Меню:" + System.lineSeparator()
                + "0. Завершить программу" + System.lineSeparator()
                + "=== Завершение программы ===" + System.lineSeparator());
    }

    @Test
    void whenReplaceItemTestOutputIsSuccessfully() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input input = new MockInput(new String[]{"0", String.valueOf(one.getId()), replaceName, "1"});
        UserAction[] actions = new UserAction[]{
                new ReplaceAction(output),
                new ExitAction(output)};
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Изменить заявку" + line
                        + "1. Завершить программу" + line
                        + "=== Изменение заявки ===" + line
                        + "Заявка успешно изменена." + line
                        + "Меню:" + line
                        + "0. Изменить заявку" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }
}
