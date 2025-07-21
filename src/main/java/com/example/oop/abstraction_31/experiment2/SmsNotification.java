package com.example.oop.abstraction_31.experiment2;

public class SmsNotification extends Notification {
    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Отправка SMS для " + recipient);
    }

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("user@mail.com",
                "Привет из email");
        SmsNotification smsNotification = new SmsNotification("+7-123-456",
                "Привет из SMS");
        emailNotification.displayInfo();
        emailNotification.send();
        smsNotification.displayInfo();
        smsNotification.send();
    }

}
