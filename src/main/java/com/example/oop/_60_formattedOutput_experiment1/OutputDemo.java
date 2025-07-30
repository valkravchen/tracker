package com.example.oop._60_formattedOutput_experiment1;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class OutputDemo {
    void demonstrateBasicFormatting() {
        String product = "системный-блок";
        double price = 45999.99;
        int quantity = 3;
        System.out.printf("Printf форматирование: товар %s, цена %.2f руб, " +
                "количество %d шт%n", product, price, quantity);

        System.out.println(String.format("String.format результат: товар %s по цене %.2f " +
                "(всего %d единиц)", product, price, quantity));

        System.out.format("Printf форматирование: товар %s, цена %.2f руб, " +
                "количество %d шт%n", product, price, quantity);
    }

    void demonstrateSpecializedFormatting() {
        double largeNumber = 1234567.89123;
        DecimalFormat pattern1 = new DecimalFormat("#,##0.00");
        System.out.println("DecimalFormat с разделителями: " + pattern1.format(largeNumber));
        DecimalFormat pattern2 = new DecimalFormat("0.#");
        System.out.println("DecimalFormat с переменной точностью: " + pattern2.format(largeNumber));
        String user = "администратор-системы";
        int operations = 156;
        String template = "MessageFormat: Пользователь {0} выполнил {1,number,integer} операций успешно";
        String message = MessageFormat.format(template, user, operations);
        System.out.println(message);
    }

    public static void main(String[] args) {
        OutputDemo demo = new OutputDemo();
        demo.demonstrateBasicFormatting();
        System.out.println("--- Специализированное форматирование ---");
        demo.demonstrateSpecializedFormatting();
    }
}