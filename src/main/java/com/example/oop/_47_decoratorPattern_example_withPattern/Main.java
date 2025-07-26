package com.example.oop._47_decoratorPattern_example_withPattern;

public class Main {
    public static void main(String[] args) {
        Text simple = new SimpleText("Привет");
        Text bold = new BoldDecorator(simple);
        Text boldItalic = new ItalicDecorator(bold);
        Text textAll = new UnderlineDecorator(boldItalic);
        System.out.println(simple.render());
        System.out.println(bold.render());
        System.out.println(boldItalic.render());
        System.out.println(textAll.render());
    }
}
