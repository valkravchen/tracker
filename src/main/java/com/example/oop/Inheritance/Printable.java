package com.example.oop.Inheritance;

public interface Printable {
    public abstract String print();

    public default String getPreview() {
        return "Предмостр документа";
    }
}
