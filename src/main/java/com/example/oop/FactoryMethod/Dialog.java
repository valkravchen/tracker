package com.example.oop.FactoryMethod;

abstract class Dialog {
    abstract Button createButton();

    void renderWindow() {
        Button button = createButton();
        button.render();
        button.onClick();
    }
}
