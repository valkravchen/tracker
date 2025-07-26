package com.example.oop.decoratorPattern_47.experiment;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРОЦЕСС 1: РЕШЕНИЕ БЕЗ ПАТТЕРНА ===");
        System.out.println("ЗАДАЧА: Добавить Slack во все комбинации");
        System.out.println("ШАГ 1: Анализ - нужны классы: Slack, EmailSlack, SMSSlack, EmailSMSSlack");
        System.out.println("ШАГ 2: Создаю SlackNotificationV1");
        SlackNotificationV1 slack = new SlackNotificationV1();
        slack.send("тест-slack");
        System.out.println("ШАГ 3: Создаю EmailSlackNotificationV");
        EmailSlackNotificationV1 emailSlack = new EmailSlackNotificationV1();
        emailSlack.send("тест-email-slack");
        System.out.println("ШАГ 4: Создаю SMSSlackNotificationV1");
        SMSSlackNotificationV1 smsSlack = new SMSSlackNotificationV1();
        smsSlack.send("тест-sms-slack");
        System.out.println("ШАГ 5: Создаю EmailSMSSlackNotificationV1");
        EmailSMSSlackNotificationV1 emailSMSSlack = new EmailSMSSlackNotificationV1();
        emailSMSSlack.send("тест-все-типы");
        System.out.println("РЕЗУЛЬТАТ ПРОЦЕССА 1: Было 4 класса → стало 7 классов");
    }
}
