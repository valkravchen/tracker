package com.example.oop._47_decoratorPattern_example_withPattern;

public class ItalicDecorator extends TextDecorator {
    ItalicDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<i>" + text.render() + "</i>";
    }
}
