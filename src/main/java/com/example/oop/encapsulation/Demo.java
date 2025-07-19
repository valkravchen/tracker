package com.example.oop.encapsulation;

public class Demo {
    public static void main(String[] args) {
        AccessDemo accessDemo1 = new AccessDemo();
        System.out.println(accessDemo1.getMessage());
        AccessDemo accessDemo2 = new AccessDemo("тест");
        System.out.println(accessDemo2.getMessage());
        AccessDemo accessDemo3 = new AccessDemo(3);
        System.out.println(accessDemo3.getMessage());
        AccessDemo accessDemo4 = AccessDemo.createPrivate();
        System.out.println(accessDemo4.getMessage());
    }
}
