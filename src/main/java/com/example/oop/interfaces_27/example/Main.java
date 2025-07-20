package com.example.oop.interfaces_27.example;

public class Main {
    public static void main(String[] args) {
        Printable doc = new Document("Важный документ");
        doc.print();
        Printable report = new Printable() {
            @Override
            public void print() {
                System.out.println("Печатаем отчет");
            }

            @Override
            public String getMessage() {
                return "Отчет готов";
            }
        };
        report.print();
    }
}
