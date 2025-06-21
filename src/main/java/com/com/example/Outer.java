package com.com.example;

import ru.oop.Local;

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


