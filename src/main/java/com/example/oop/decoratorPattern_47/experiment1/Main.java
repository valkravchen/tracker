package com.example.oop.decoratorPattern_47.experiment1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проблема без паттерна - много классов для комбинаций:");
        BasicNotification basic = new BasicNotification();
        EmailWithSMSNotification emailSms = new EmailWithSMSNotification();
        EmailWithSMSAndSlackNotification all = new EmailWithSMSAndSlackNotification();
        basic.send("базовое-сообщение");
        emailSms.send("комбинированное-сообщение");
        all.send("комбинированное-сообщение");
        System.out.println("Проблема: нужно создавать класс для каждой комбинации!");
    }
}
