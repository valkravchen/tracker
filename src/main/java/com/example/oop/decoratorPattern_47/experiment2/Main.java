package com.example.oop.decoratorPattern_47.experiment2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Решение с паттерном Декоратор - гибкие комбинации:");
        Notification simple = new BasicNotification();
        Notification withEmail = new EmailDecorator(new BasicNotification());
        Notification combined = new SMSDecorator(new EmailDecorator(new BasicNotification()));
        simple.send("простое-уведомление");
        withEmail.send("email-уведомление");
        combined.send("комбинированное-уведомление");
        System.out.println("Преимущество: один интерфейс, гибкие комбинации!");
    }
}
