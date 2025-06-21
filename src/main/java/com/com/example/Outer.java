package com.com.example;

public class Outer {
    void printMessage(String message) {
        int repeatCount = 3;

        class MessagePrinter {
            void print() {
                for (int i = 0; i < repeatCount; i++) {
                    System.out.println(message);
                }
            }
        }

        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.print();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printMessage("Привет от локального класса!");
    }
}
