package ru.tracker;

import org.junit.jupiter.api.Test;
import ru.action.*;

import static org.assertj.core.api.Assertions.*;

class StartUITest {

    @Test
    void whenExit() {
        Output output = new MockOutput();
        Input input = new MockInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new Exit(output)};
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
        Item two = tracker.add(new Item("test2"));
        String replaceName = "New Test Name";
        Input input = new MockInput(new String[]{"0", String.valueOf(one.getId()), replaceName, "1"});
        UserAction[] actions = new UserAction[]{
                new Replace(output),
                new Exit(output)
        };
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

    @Test
    void whenReplaceItemWithInvalidIdThenErrorMessage() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        int invalidId = two.getId() + 1;
        String replaceName = "New Test Name";
        Input input = new MockInput(new String[]{"0", String.valueOf(invalidId), replaceName, "1"});
        UserAction[] actions = new UserAction[]{
                new Replace(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Изменить заявку" + line
                        + "1. Завершить программу" + line
                        + "=== Изменение заявки ===" + line
                        + "Ошибка: заявка с id " + invalidId + " не найдена." + line
                        + "Меню:" + line
                        + "0. Изменить заявку" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }

    @Test
    void whenFindAllItemsThenShowAll() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        Input input = new MockInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindAll(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Показать все заявки" + line
                        + "1. Завершить программу" + line
                        + "=== Вывод всех заявок ===" + line
                        + one + line
                        + two + line
                        + "Меню:" + line
                        + "0. Показать все заявки" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }

    @Test
    void whenFindAllWithNoItemsThenShowEmptyMessage() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Input input = new MockInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindAll(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Показать все заявки" + line
                        + "1. Завершить программу" + line
                        + "=== Вывод всех заявок ===" + line
                        + "Хранилище еще не содержит заявок" + line
                        + "Меню:" + line
                        + "0. Показать все заявки" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }

    @Test
    void whenFindItemsByNameThenShowFound() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        String findName = "test1";
        Input input = new MockInput(
                new String[]{"0", findName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByName(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Найти заявки по имени" + line
                        + "1. Завершить программу" + line
                        + "=== Вывод заявки по имени ===" + line
                        + one + line
                        + "Меню:" + line
                        + "0. Найти заявки по имени" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }

    @Test
    void whenFindItemsByNameThenShowNotFoundMessage() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        String findName = "test3";
        Input input = new MockInput(
                new String[]{"0", findName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByName(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Найти заявки по имени" + line
                        + "1. Завершить программу" + line
                        + "=== Вывод заявки по имени ===" + line
                        + "Ошибка: заявки с именем " + findName + " не найдены." + line
                        + "Меню:" + line
                        + "0. Найти заявки по имени" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }

    @Test
    void whenFindItemByIdThenShowFound() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        int findId = 1;
        Input input = new MockInput(
                new String[]{"0", String.valueOf(findId), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindById(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Найти заявку по id" + line
                        + "1. Завершить программу" + line
                        + "=== Вывод заявки по id ===" + line
                        + one + line
                        + "Меню:" + line
                        + "0. Найти заявку по id" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }

    @Test
    void whenFindItemByIdThenShowNotFoundMessage() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        int findId = 3;
        Input input = new MockInput(
                new String[]{"0", String.valueOf(findId), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindById(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String line = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + line
                        + "0. Найти заявку по id" + line
                        + "1. Завершить программу" + line
                        + "=== Вывод заявки по id ===" + line
                        + "Ошибка: заявка с id " + findId + " не найдена." + line
                        + "Меню:" + line
                        + "0. Найти заявку по id" + line
                        + "1. Завершить программу" + line
                        + "=== Завершение программы ===" + line
        );
    }
}