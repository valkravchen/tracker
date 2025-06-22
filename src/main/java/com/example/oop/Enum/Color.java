package com.example.oop.Enum;

enum Color implements Printable {
    RED {
        public void print() {
            System.out.println("Красный");
        }
    },
    GREEN {
        public void print() {
            System.out.println("Зеленый");
        }
    };
}
