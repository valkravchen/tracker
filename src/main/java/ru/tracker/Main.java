package ru.tracker;

public class Main {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        for (Item item : tracker.findAll()) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }

        Item item4 = new Item("Замена Item 1");
        boolean replaced = tracker.replace(1, item4);

        for (Item item : tracker.findAll()) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }

        for (Item item : tracker.findByName("Item 2")) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }

        Item item5 = tracker.findById(1);
        System.out.println(item5.getName());
    }
}
