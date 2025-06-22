package com.example.oop.FactoryMethod;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WebButton();
    }
}
