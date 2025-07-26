package com.example.oop.decoratorPattern_47.experiment.withoutPattern;

public class SMSSlackNotificationV1 {
    void send(String message) {
        System.out.println("SMS уведомление: " + message);
        System.out.println("Slack уведомление: " + message);
    }
}
