package com.example.oop.Inheritance;

public class ProcessorTester {
    public static void testProcessor(DataProcessor processor) {
        System.out.println(processor.process());
        System.out.println(processor.getInfo());
    }

    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor("Text1");
        System.out.println(textProcessor.getData());
        System.out.println(textProcessor.process());
        System.out.println(textProcessor.getInfo());
        System.out.println(textProcessor.getDefaultInfo());
        System.out.println(DataProcessor.getVersion());
        System.out.println(DataProcessor.MAX_DATA_LENGTH);
        System.out.println();
        DataProcessor dataProcessor = new TextProcessor("Text1");
        System.out.println(dataProcessor.process());
        System.out.println(dataProcessor.getInfo());
        System.out.println();
        testProcessor(textProcessor);
    }
}
