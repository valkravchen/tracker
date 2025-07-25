package com.example.oop.decoratorPattern_47.experiment2;

public class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Базовое уведомление: " + message);
    }
}
