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
// Класс PhoneDemo — демонстрирует создание и использование объектов телефона
class PhoneDemo {
    public static void main(String[] args) {
        // Создаём первый объект — iPhone
        Phone iPhone = new Phone("X");
        // Создаём второй объект — Samsung
        Phone samsung = new Phone("S21");
        iPhone.call(); // Вывод: X звонит
        samsung.call(); // Вывод: S21 звонит
    }
}
