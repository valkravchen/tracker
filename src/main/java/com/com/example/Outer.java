package com.com.example;

public class Outer {
    void method() {
        String localVar = "Локальная";

        class Local {
            void print() {
                System.out.println(localVar);
            }
        }

        Local local = new Local();
        local.print();
    }
}
