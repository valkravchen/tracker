package com.com.example;

public class Outer {
    void printMessage() {
        final String localVar = "Здравстсвуй, локальный класс!";
        class Local {
            void print() {
                System.out.println(localVar);
            }
        }
        Local local = new Local();
        local.print();
    }
}


