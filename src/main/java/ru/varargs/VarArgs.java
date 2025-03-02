package ru.varargs;

public class VarArgs {
    public static void printAll(Object...items) {
        for (Object item : items) {
            System.out.println(item.getClass().getSimpleName() + ": " + item);
        }
    }

    public static void main(String[] args) {
        printAll("Hello", 3, 3.333, true);
    }
}


