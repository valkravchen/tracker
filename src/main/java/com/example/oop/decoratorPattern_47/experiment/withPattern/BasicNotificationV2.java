package com.example.oop.decoratorPattern_47.experiment.withPattern;

public class BasicNotificationV2 implements NotificationV2 {
    @Override
    public void send(String message) {
        System.out.println("Базовое уведомление: " + message);
    }
}
