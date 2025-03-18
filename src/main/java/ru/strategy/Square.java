package ru.strategy;

public class Square implements Shape {

    @Override
    public String draw() {
        String line = System.lineSeparator();
        return " ----- " + line
                + "|     |" + line
                + "|     |" + line
                + " ----- " + line;
    }
}
