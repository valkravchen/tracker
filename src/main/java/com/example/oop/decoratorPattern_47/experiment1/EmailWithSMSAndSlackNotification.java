package com.example.oop.decoratorPattern_47.experiment1;

public class EmailWithSMSAndSlackNotification {
    void send(String message) {
        System.out.println("Email уведомление: " + message);
        System.out.println("SMS уведомление: " + message);
        System.out.println("Slack уведомление: " + message);
    }
}
