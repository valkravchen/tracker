package ru.varargs;

public class VarArgs {

    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return builder + " количество соединенных элементов: " + strings.length;
    }

    public static void main(String[] args) {
        System.out.println(text("aaa", "bbb", "ccc"));
    }
}


