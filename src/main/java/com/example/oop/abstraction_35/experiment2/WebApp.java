package com.example.oop.abstraction_35.experiment2;

public class WebApp implements Configurable {
    @Override
    public String getConfigValue(String key) {
        return "значение_" + key;
    }
}
