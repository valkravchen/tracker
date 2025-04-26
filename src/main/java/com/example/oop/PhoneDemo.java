package com.example.oop;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone iPhone = new Phone("X");
        Phone samsung = new Phone("S21");
        iPhone.call();
        samsung.call();
    }
}
