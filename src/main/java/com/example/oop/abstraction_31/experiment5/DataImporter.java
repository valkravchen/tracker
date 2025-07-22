package com.example.oop.abstraction_31.experiment5;

public abstract class DataImporter {
    final void importData() {
        System.out.println("=== Начало импорта данных ===");
        readData();
        validateData();
        processData();
        saveData();
        System.out.println("=== Импорт завершен ===");
    }

    protected abstract String readData();

    protected abstract boolean validateData();

    protected abstract void processData();

    protected abstract void saveData();
}
