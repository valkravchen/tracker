package com.example.oop.decoratorPattern_47.experiment.withoutPattern;

import com.example.oop.decoratorPattern_47.experiment.withPattern.*;

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
        System.out.println("РЕЗУЛЬТАТ ПРОЦЕССА 1: Было 4 класса → стало 8 классов");
        System.out.println("=== ПРОЦЕСС 2: РЕШЕНИЕ С ПАТТЕРНОМ ===");
        System.out.println("ШАГ 1: Рефакторим существующий код в паттерн Декоратор");
        System.out.println("ШАГ 2: Создаю SlackDecoratorV2 - ОДИН класс для всех комбинаций");
        System.out.println("ШАГ 3: Тестируем все комбинации с помощью одного SlackDecorator");
        NotificationV2 slackOnly = new SlackDecoratorV2(new BasicNotificationV2());
        slackOnly.send("только-slack");
        NotificationV2 emailSlackCombo = new SlackDecoratorV2(new EmailDecoratorV2(new BasicNotificationV2()));
        emailSlackCombo.send("email-slack-комбо");
        NotificationV2 smsSlackCombo = new SlackDecoratorV2(new SMSDecoratorV2(new BasicNotificationV2()));
        smsSlackCombo.send("sms-slack-комбо");
        NotificationV2 allTypes = new SlackDecoratorV2(new SMSDecoratorV2(
                new EmailDecoratorV2(new BasicNotificationV2())));
        allTypes.send("allTypes");
    }
}
