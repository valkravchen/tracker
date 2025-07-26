package com.example.oop.decoratorPattern_47.experiment;

public class EmailSMSNotificationV1 {
    void send(String message) {
        System.out.println("Email уведомление: " + message);
        System.out.println("SMS уведомление: " + message);
    }
}
