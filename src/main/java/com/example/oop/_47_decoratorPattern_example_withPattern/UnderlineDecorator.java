package com.example.oop._47_decoratorPattern_example_withPattern;

public class UnderlineDecorator extends TextDecorator {
    UnderlineDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<u>" + text.render() + "</u>";
    }
}
