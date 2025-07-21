package com.example.oop.abstraction_31.experiment2;

public class EmailNotification extends Notification {
    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Отправка email для " + recipient);
    }
}
