package com.example.oop.encapsulation;

public class AccessDemo {
    private String message;

    public AccessDemo() {
        this.message = "Public constructor";
    }

    protected AccessDemo(String message) {
        this.message = "Protected: " + message;
    }

    AccessDemo(int num) {
        this.message = "Package-private: " + num;
    }

    private AccessDemo(boolean flag) {
        this.message = "Private: " + flag;
    }

    public String getMessage() {
        return message;
    }

    public static AccessDemo createPrivate() {
        return new AccessDemo(true);
    }
}
