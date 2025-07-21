package com.example.oop.abstraction_31.experiment1;

public abstract class BaseConfiguration {
    private String appName = "MyApp";
    private String version = "1";

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public void displayInfo() {
        System.out.println("Приложение: " + getAppName() + ", версия: " + getVersion());
    }
}
