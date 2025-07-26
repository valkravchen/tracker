package com.example.oop._47_decoratorPattern_example_withPattern;

public abstract class TextDecorator implements Text {
    protected Text text;

    TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text.render();
    }
}
