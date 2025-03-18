package ru.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявки по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявки по имени ===");
        String name = input.ascStr("Введите имя заявки: ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Ошибка: заявки с именем " + name + " не найдены.");
        }
        return true;
    }
}
