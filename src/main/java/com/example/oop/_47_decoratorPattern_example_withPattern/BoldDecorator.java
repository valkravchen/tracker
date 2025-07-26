package com.example.oop._47_decoratorPattern_example_withPattern;

public class BoldDecorator extends TextDecorator {
    BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<b>" + text.render() + "</b>";
    }
}
