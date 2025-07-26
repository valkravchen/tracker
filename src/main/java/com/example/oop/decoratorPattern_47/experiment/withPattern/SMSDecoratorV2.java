package com.example.oop.decoratorPattern_47.experiment.withPattern;

public class SMSDecoratorV2 extends NotificationDecoratorV2 {
    public SMSDecoratorV2(NotificationV2 notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS декоратор добавляет отправку для: " + message);
    }
}
