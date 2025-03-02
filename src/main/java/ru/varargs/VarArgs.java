package ru.varargs;

public class VarArgs {
    public static String text(String[] strings) {
        return "";
    }

    public static void main(String[] args) {
        String[] strings = {"aaa", "bbb", "ccc"};
        String str = text(strings);
        System.out.println(str);
    }
}

