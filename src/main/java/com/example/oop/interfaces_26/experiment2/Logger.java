package com.example.oop.interfaces_26.experiment2;

public interface Logger {
    void log(String message);

    default void info(String message) {
        log("INFO: " + message);
    }

    default void error(String message) {
        log("ERROR: " + message);
    }

    default void debug(String message) {
        log("DEBUG: " + message);
    }
}
