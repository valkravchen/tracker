package com.example.oop.nestedClasses;

public class DataProcessor {
    private final String processorName;
    private final int id;

    public DataProcessor(String processorName, int id) {
        this.processorName = validateProcessorName(processorName);
        this.id = validateId(id);
    }

    private String validateProcessorName(String processorName) {
        if (processorName == null || processorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя процессора не может быть null или пустой строкой");
        }
        return processorName;
    }

    private int validateId(int id) {
        if (id < 1) {
            throw new IllegalArgumentException("ID не может быть меньше 1");
        }
        return id;
    }

    public String getProcessorName() {
        return processorName;
    }

    public int getId() {
        return id;
    }

    public static class Utility {
        public static String formatData(String data) {
            if (data == null || data.trim().isEmpty()) {
                throw new IllegalArgumentException("Данные не могут быть null");
            }
            return data.trim().toUpperCase();
        }
    }

    public static class Constans {
        public static final String DEFAULT_FORMAT = "UPPERCASE";

        public static String getDefaultFormat() {
            return DEFAULT_FORMAT;
        }
    }

    public static class Builder {
        private String tempName;
        private int tempId;

        public Builder setTempName(String tempName) {
            if (tempName == null || tempName.trim().isEmpty()) {
                throw new IllegalArgumentException("Имя не может быть null или пустой строкой");
            }
            return this;
        }

        public Builder setTempId(int tempId) {
            if (tempId < 1) {
                throw new IllegalArgumentException("ID не может быть меньше 1");
            }
            return this;
        }

        public static void main(String[] args) {
            System.out.println(DataProcessor.Utility.formatData("test data"));
            System.out.println(DataProcessor.Constans.getDefaultFormat());
        }
    }
}
