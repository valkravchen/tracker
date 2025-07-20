package com.example.oop.interfaces_27.example;

public class Document implements Printable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Печатаем: " + content);
    }

    @Override
    public String getMessage() {
        return "Документ готов к печати";
    }
}
