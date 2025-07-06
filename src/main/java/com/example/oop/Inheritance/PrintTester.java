package com.example.oop.Inheritance;

public class PrintTester {
    public static void testPrint(Printable printable) {
        System.out.println(printable.print());
        System.out.println(printable.getPreview());
    }

    public static void main(String[] args) {
        Document document = new Document("Report", "This is a report");
        System.out.println(document.getTitle());
        System.out.println(document.getContent());
        System.out.println(document.print());
        System.out.println(document.getPreview());
        System.out.println(document.getDefaultPreview());
        System.out.println();
        testPrint(document);
        System.out.println();
        Printable[] printables = {
                new Document("Report", "This is a report"),
                new Document("Memo", "This is a memo")
        };
        for (Printable printable: printables) {
            System.out.println(printable.print());
        }
    }
}
