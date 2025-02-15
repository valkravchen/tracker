package ru.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
    }
}
