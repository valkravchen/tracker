package com.example.oop.FactoryMethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Отрисована Windows-кнопка");
    }

    @Override
    public void onClick() {
        System.out.println("Обработан клик в Windows-стиле");
    }
}
