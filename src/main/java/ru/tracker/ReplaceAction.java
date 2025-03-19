package ru.tracker;

public class ReplaceAction implements UserAction {

    private final Output output;

    public ReplaceAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Изменение заявки ===");
        int id = input.ascInt("Введите id заявки: ");
        String newName = input.ascStr("Введите новое имя: ");
        Item item = new Item(newName);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка успешно изменена.");
        } else {
            System.out.println("Ошибка: заявка с id " + id + " не найдена.");
        }
        return true;
    }
}
