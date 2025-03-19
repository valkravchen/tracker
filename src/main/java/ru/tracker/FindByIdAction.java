package ru.tracker;

public class FindByIdAction implements UserAction {
    private final Output output;

    public FindByIdAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Найти заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод заявки по id ===");
        int id = input.ascInt("Введите id заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            output.println(item);
        } else {
            output.println("Ошибка: заявка с id " + id + " не найдена.");
        }
        return true;
    }
}
