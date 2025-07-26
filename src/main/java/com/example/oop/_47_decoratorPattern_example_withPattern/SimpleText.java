package com.example.oop._47_decoratorPattern_example_withPattern;

public class SimpleText implements Text {
    private String content;

    public SimpleText(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return content;
    }
}
