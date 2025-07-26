package com.example.oop.decoratorPattern_47.experiment.withoutPattern;

public class EmailSlackNotificationV1 {
    void send(String message) {
        System.out.println("Email уведомление: " + message);
        System.out.println("Slack уведомление: " + message);
    }
}
