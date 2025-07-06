package com.example.oop.Inheritance;

public class TextProcessor implements DataProcessor {
    private String data;

    public TextProcessor(String data) {
        this.data = validateTextProcessor(data);
    }

    @Override
    public String process() {
        return "Обработка данных: " + data;
    }

    @Override
    public String getInfo() {
        return "Информация о процессоре: TextProcessor для " + data;
    }

    public String getDefaultInfo() {
        return DataProcessor.super.getInfo();
    }

    public String getData() {
        return data;
    }

    private String validateTextProcessor(String data) {
        if (data == null || data.trim().isEmpty()) {
            throw new IllegalArgumentException("Данные не могут быть null или пустой строкой");
        }
        if (data.length() > MAX_DATA_LENGTH) {
            throw new IllegalArgumentException("Длина данных не может превышать 100 символов");
        }
        return data;
    }
}
