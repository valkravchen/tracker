package com.example.oop.interfaces_27.experiment1;

public class DocumentPrinter implements Printable {
    private String printName;

    public DocumentPrinter(String printerName) {
        this.printName = printerName;
    }

    @Override
    public void print(String text) {
        System.out.println("[" + printName + "] Печать: " + text);
    }
}
