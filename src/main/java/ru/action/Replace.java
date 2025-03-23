package ru.action;

import ru.tracker.Input;
import ru.tracker.Item;
import ru.tracker.Output;
import ru.tracker.Tracker;

public class Replace implements UserAction {
    private final Output output;

    public Replace(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Изменение заявки ===");
        int id = input.ascInt("Введите id заявки: ");
        String newName = input.ascStr("Введите новое имя: ");
        Item item = new Item(newName);
        if (tracker.replace(id, item)) {
            output.println("Заявка успешно изменена.");
        } else {
            output.println("Ошибка: заявка с id " + id + " не найдена.");
        }
        return true;
    }
}
