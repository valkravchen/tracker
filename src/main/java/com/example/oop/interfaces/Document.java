package com.example.oop.interfaces;

public class Document implements Printable {
    private String text;

    public Document(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }

    public static void main(String[] args) {
        Document document = new Document("Java интерфейсы");
        document.print();
        document.printWithBorder();
    }
}
