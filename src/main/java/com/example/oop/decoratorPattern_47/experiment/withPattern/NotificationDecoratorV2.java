package com.example.oop.decoratorPattern_47.experiment.withPattern;

public abstract class NotificationDecoratorV2 implements NotificationV2 {
    protected NotificationV2 notification;

    public NotificationDecoratorV2(NotificationV2 notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
    }
}
