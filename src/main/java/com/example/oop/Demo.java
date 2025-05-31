package com.example.oop;

public class Demo {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Наука побеждать", "Александр Васильевич Суворов");
        System.out.println("Название книги: " + book.getTittle() + "; автор книги: " + book.getAuthor());
        System.out.println("Название книги: " + book1.getTittle() + "; автор книги: " + book1.getAuthor());
    }
}
