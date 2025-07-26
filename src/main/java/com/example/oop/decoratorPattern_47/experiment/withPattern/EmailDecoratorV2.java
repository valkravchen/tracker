package com.example.oop.decoratorPattern_47.experiment.withPattern;

public class EmailDecoratorV2 extends NotificationDecoratorV2 {
    public EmailDecoratorV2(NotificationV2 notificationV) {
        super(notificationV);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Email декоратор добавляет отправку для: " + message);
    }
}
