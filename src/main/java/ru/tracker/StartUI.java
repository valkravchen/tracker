package ru.tracker;

public class StartUI {
    
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = Integer.parseInt(input.ascStr("Выбрать: "));
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
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
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявки по id ===");
        int id = Integer.parseInt(input.ascStr("Введите id заявки: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Ошибка: заявка с id " + id + " не найдена.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = Integer.parseInt(input.ascStr("Введите id заявки: "));
        if (tracker.delete(id)) {
            System.out.println("Заявка успешно удалена.");
        } else {
            System.out.println("Ошибка: заявка с id " + id + " не найдена.");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Изменение заявки ===");
        int id = Integer.parseInt(input.ascStr("Введите id заявки: "));
        String newName = input.ascStr("Введите новое имя: ");
        Item item = new Item(newName);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка успешно изменена.");
        } else {
            System.out.println("Ошибка: заявка с id " + id + " не найдена.");
        }
    }

    public static void findAllItems(Tracker tracker) {
        System.out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.ascStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени", "Завершить программу"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
        StartUI.createItem(input, tracker);
    }
}



