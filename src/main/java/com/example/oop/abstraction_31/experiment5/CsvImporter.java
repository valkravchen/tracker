package com.example.oop.abstraction_31.experiment5;

public class CsvImporter extends DataImporter {
    @Override
    public String readData() {
        System.out.println("Чтение данных из CSV файла");
        return "CSV данные";
    }

    @Override
    public boolean validateData() {
        System.out.println("Валидация CSV данных");
        return true;
    }

    @Override
    public void processData() {
        System.out.println("Обработка CSV данных");
    }

    @Override
    public void saveData() {
        System.out.println("Сохранение CSV данных в базу");
    }
}
