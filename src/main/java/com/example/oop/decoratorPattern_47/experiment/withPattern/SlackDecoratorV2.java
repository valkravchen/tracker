package com.example.oop.decoratorPattern_47.experiment.withPattern;

public class SlackDecoratorV2 extends NotificationDecoratorV2 {
    public SlackDecoratorV2(NotificationV2 notificationV2) {
        super(notificationV2);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Slack декоратор добавляет отправку для: " + message);
    }
}
