package com.example.oop.decoratorPattern_47.experiment;

public class EmailSMSSlackNotificationV1 {
    void send(String message) {
        System.out.println("Email уведомление: " + message);
        System.out.println("SMS уведомление: " + message);
        System.out.println("Slack уведомление: " + message);
    }
}
