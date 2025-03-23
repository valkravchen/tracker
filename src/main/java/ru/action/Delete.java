package ru.action;

import ru.tracker.Input;
import ru.tracker.Output;
import ru.tracker.Tracker;

public class Delete implements UserAction {
    private final Output output;

    public Delete(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Удаление заявки ===");
        int id = input.ascInt("Введите id заявки: ");
        if (tracker.delete(id)) {
            output.println("Заявка успешно удалена.");
        } else {
            output.println("Ошибка: заявка с id " + id + " не найдена.");
        }
        return true;
    }
}
