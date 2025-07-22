package com.example.oop.abstraction_31.experiment5;

public class JsonImporter extends DataImporter {
    @Override
    public String readData() {
        System.out.println("Чтение данных из JSON файла");
        return "JSON данные";
    }

    @Override
    public boolean validateData() {
        System.out.println("Валидация JSON данных");
        return true;
    }

    @Override
    public void processData() {
        System.out.println("Обработка JSON данных");
    }

    @Override
    public void saveData() {
        System.out.println("Сохранение JSON данных в базу");
    }

    public static void main(String[] args) {
        CsvImporter csvImporter = new CsvImporter();
        JsonImporter jsonImporter = new JsonImporter();
        csvImporter.importData();
        jsonImporter.importData();
    }
}
