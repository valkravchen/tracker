package com.example.oop.decoratorPattern_47.experiment1;

public class EmailWithSMSNotification {
    void send(String message) {
        System.out.println("Email уведомление: " + message);
        System.out.println("SMS уведомление: " + message);
    }
}
