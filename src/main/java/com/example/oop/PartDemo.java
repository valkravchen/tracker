package com.example.oop;

public class PartDemo {
    public static void main(String[] args) {
        Part blockPart = new Part("Блочная часть");
        Part ballPart = new Part("Шаровая часть");
        blockPart.assemble();
        ballPart.assemble();
    }
}
