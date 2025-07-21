package com.example.oop.abstraction_31.experiment1;

public class ProductionConfig extends BaseConfiguration {
    public void loadSettings() {
        System.out.println("Загружаю настройки для продакшена");
    }

    public static void main(String[] args) {
        ProductionConfig productionConfig = new ProductionConfig();
        productionConfig.displayInfo();
        productionConfig.loadSettings();
    }
}
