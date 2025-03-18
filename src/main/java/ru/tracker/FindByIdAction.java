package ru.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявки по id ===");
        int id = input.ascInt("Введите id заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Ошибка: заявка с id " + id + " не найдена.");
        }
        return true;
    }
}
