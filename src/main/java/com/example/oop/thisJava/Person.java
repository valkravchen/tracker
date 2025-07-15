package com.example.oop.thisJava;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void introduce() {
        Reporter.printOwner(this);
    }

    public static void main(String[] args) {
        Person person = new Person("Иван");
        person.introduce();
    }
}
