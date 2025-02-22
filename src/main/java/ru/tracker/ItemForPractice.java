package ru.tracker;

import java.time.LocalDateTime;

public class ItemForPractice {
    private int id;
    private String name;
    private String description;
    private final LocalDateTime created = LocalDateTime.now();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemForPractice() {
    }

    public ItemForPractice(String name) {
        this.name = name;
    }

    public ItemForPractice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ItemForPractice(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static void main(String[] args) {
        ItemForPractice item1 = new ItemForPractice();
        ItemForPractice item2 = new ItemForPractice("item2");
        ItemForPractice item3 = new ItemForPractice(3, "item3");
        System.out.println(item1.getId() + item1.getName() + item1.getDescription() + item1.getCreated());
        System.out.println(item2.getName());
        System.out.println(item3.getId() + " " + item3.getName());
    }
}




