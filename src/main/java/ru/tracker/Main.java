package ru.tracker;

public class Main {
    public static void main(String[] args) {

        Tracker tracker = new Tracker();

        System.out.println("Добавляем объекты:");

        Item item1 = new Item("Первый");
        Item item2 = new Item();
        Item item3 = new Item("Третий");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        System.out.println("Добавлено: ID = " + item1.getId() + ", Name = " + item1.getName());
        System.out.println("Добавлено: ID = " + item2.getId() + ", Name = " + item2.getName());
        System.out.println("Добавлено: ID = " + item3.getId() + ", Name = " + item3.getName());


        System.out.println("\nВсе элементы в трекере:");
        for (Item item : tracker.findAll()) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }

        System.out.println("\nПроверяем поиск по ID");
    }
}
