package ru.tracker;

import java.time.LocalDateTime;

public class ItemForPractice {
    private int id;
    private String name;
    private final LocalDateTime created = LocalDateTime.now();
    private String description;

    public ItemForPractice() {
    }

    public  ItemForPractice(String name) {
        this.name = name;
    }

    public  ItemForPractice (int id, String name) {
        this.id = id;
        this.name = name;
    }
        public ItemForPractice(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    ItemForPractice itemForPractice1 = new ItemForPractice();
    ItemForPractice itemForPractice2 = new ItemForPractice("name");
    ItemForPractice itemForPractice3 = new ItemForPractice(3, "name");
    ItemForPractice itemForPractice4 = new ItemForPractice(4, "name", "description");
}

