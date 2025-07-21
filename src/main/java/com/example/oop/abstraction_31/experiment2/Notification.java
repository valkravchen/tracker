package com.example.oop.abstraction_31.experiment2;

public abstract class Notification {
    protected String recipient;
    protected String message;

    protected Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void send();

    public void displayInfo() {
        System.out.println("Получатель: " + recipient + ", Сообщение: " + message);
    }
}
