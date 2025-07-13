package com.example.oop.constructor;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getInfo() {
        return "Книга: " + title + ", автор: " + author;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание", "Ф.М. Достоевский");
        Book book2 = new Book("Мастер и Маргарита", "М.А. Булгаков");
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
    }
}
