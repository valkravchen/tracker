package com.example.oop;
// Класс Phone — шаблон для телефона, демонстрирует основы ООП
public class Phone {
    // Поля — данные о телефоне
    private String model; // Модель телефона (например, "X")
    // Конструктор — задаёт начальные характеристики телефона
    public Phone(String model) {
        this.model = model;
    }
    // Метод — действие, моделирует звонок
    public void call() {
        System.out.println(model + " звонит");
    }
}
