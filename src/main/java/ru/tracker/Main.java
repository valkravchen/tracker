package ru.tracker;

public class Main {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Первый");
        Item item2 = new Item();
        Item item3 = new Item("Третий");
        System.out.println("1. Метод add.");
        System.out.println("Добавляем элементы.\n");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        System.out.println("Добавлено: ID = " + item1.getId() + ", Name = " + item1.getName());
        System.out.println("Добавлено: ID = " + item2.getId() + ", Name = " + item2.getName());
        System.out.println("Добавлено: ID = " + item3.getId() + ", Name = " + item3.getName());
        System.out.println("\n2. Метод findAll.");
        System.out.println("Все элементы в трекере.\n");
        for (Item item : tracker.findAll()) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }
        System.out.println("\n3. Метод findById.");
        System.out.println("Проверяем поиск по ID.\n");
        int searchId = 4;
        Item foundItem = tracker.findById(searchId);
        System.out.println("Результат поиска по ID = " + searchId + ": " +
                (foundItem != null ? foundItem.getName() : "объект не найден"));
        System.out.println("\n4. Метод findByName.");
        System.out.println("Проверяем поиск по имени.");
        String searchName = "Третий";
        Item[] foundByMName = tracker.findByName(searchName);
        for (Item item : foundByMName) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }
        System.out.println("\n5. replace");
        System.out.println("Проверяем замену элемента.");
    }
}
