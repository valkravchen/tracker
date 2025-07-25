package com.example.oop.decoratorPattern_47.experiment2;

public class EmailDecorator extends NotificationDecorator {
    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Email декоратор добавляет: отправка на email для " + message);
    }
}
