package ru.record;

public record PersonRecord(String name, int age) {
    public PersonRecord {
        if (age > 101) {
            throw new IllegalArgumentException("Возраст должен быть менее 101");
        }
    }
}

