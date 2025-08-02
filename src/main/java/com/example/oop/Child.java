package com.example.oop;

public class Child extends Parent{
    static void print() {
        System.out.println("Child");
    } // Сокрытие метода
    String value = "Child"; // Сокрытие переменной

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.print(); // "Parent" (вызов по типу ссылки Parent)
        System.out.println(obj.value);
    }
}
