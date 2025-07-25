package com.example.oop.decoratorPattern_47.experiment2;

public class SMSDecorator extends NotificationDecorator{
    public SMSDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS декоратор добавляет: отправка SMS для " + message);
    }
}
