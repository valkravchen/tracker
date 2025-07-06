package com.example.oop.Inheritance;

public class LoggerTester {
    public static void testLogger(Loggable loggable) {
        System.out.println(loggable.log("Test"));
        System.out.println(loggable.getLogInfo());
    }

    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger("log1.txt");
        System.out.println(fileLogger.getLogFile());
        System.out.println(fileLogger.log("Hello"));
        System.out.println(fileLogger.getLogInfo());
        System.out.println(fileLogger.getDefaultLogInfo());
        System.out.println();
        testLogger(fileLogger);
        System.out.println();
        Loggable loggable = new Loggable() {
            @Override
            public String log(String message) {
                return "Логгирование в анонимный лог: " + message;
            }
        };
        System.out.println(loggable.log("Test"));
        System.out.println();
        Loggable[] loggables = {
                new FileLogger("log1.txt"),
                new FileLogger("log2.txt")
        };
        for (Loggable loggable1 : loggables) {
            System.out.println(loggable1.log("ArrayTest"));
        }
    }
}
