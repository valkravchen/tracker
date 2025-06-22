package com.example.oop.FactoryMethod;

public class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("Отрисована HTML-кнопка");
    }

    @Override
    public void onClick() {
        System.out.println("Выполнен AJAX-запрос");
    }
}
