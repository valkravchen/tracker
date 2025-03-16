package ru.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String ascStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int ascInt(String question) {
        return Integer.parseInt(ascStr(question));
    }
}
