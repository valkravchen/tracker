package com.example.oop.nheritance;

public class FileLogger extends Logger {
    @Override
    public void log() {
        System.out.println("Лог в файл");
        super.log();
    }

    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.log();
    }
}
