package com.example.oop.methodOverloading;

public class Processor {
    private String name;

    public Processor(String name) {
        this.name = validateName(name);
    }

    public int process(int value) {
        validateValue(value);
        return value * value;
    }

    public double process(double value) {
        validateValue(value);
        return value * value * value;
    }

    public String process(String input) {
        validateValue(input);
        return input.toUpperCase();
    }

    public boolean process(int a, int b) {
        validateValue(a, b);
        return (a + b) > 10;
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть null или пустой строкой");
        }
        return name;
    }

    private void validateValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        }
    }

    private void validateValue(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        }
    }

    private void validateValue(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Входная строка не может быть null ли пустой строкой");
        }
    }

    private void validateValue(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Значения не могут быть отрицательными");
        }
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Processor processor = new Processor("DataProcessor");
        System.out.println(processor.process(5));
        System.out.println(processor.process(2.5));
        System.out.println(processor.process("hello"));
        System.out.println(processor.process(6, 7));
    }
}
