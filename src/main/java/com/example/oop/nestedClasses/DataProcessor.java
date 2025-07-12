package com.example.oop.nestedClasses;

public class DataProcessor {
    private final String processorName;

    public DataProcessor(String processorName) {
        this.processorName = validateProcessorName(processorName);
    }

    private String validateProcessorName(String processorName) {
        if (processorName == null || processorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя процессора не может быть null или пустой строкой");
        }
        return processorName;
    }

    public String getProcessorName() {
        return processorName;
    }

    public static class Utility {
        public static String formatData(String data) {
            if (data == null || data.trim().isEmpty()) {
                throw new IllegalArgumentException("Данные не могут быть null");
            }
            return data.trim().toUpperCase();
        }
    }

    public static void main(String[] args) {
        System.out.println(DataProcessor.Utility.formatData("test data"));
    }
}
