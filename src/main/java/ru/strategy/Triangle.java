package ru.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String line = System.lineSeparator();
        return "   ^    " + line
                + " /   \\ " + line
                + "/_____\\" + line;
    }
}

