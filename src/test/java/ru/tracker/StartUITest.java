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
}