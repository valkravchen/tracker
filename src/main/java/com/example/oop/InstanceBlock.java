package com.example.oop;

public class InstanceBlock {
    private String name;

    {
        name = "По умолчанию";
        System.out.println("Блок экземляра выполнен");
    }

    public void InstanceBlockDemo() {
        System.out.println("Конструктор выполнен");
    }

    public static void main(String[] args) {
        InstanceBlock instanceBlock = new InstanceBlock();
        instanceBlock.InstanceBlockDemo();
    }
}
