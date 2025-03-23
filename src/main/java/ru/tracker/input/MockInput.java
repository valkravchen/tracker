package ru.tracker.input;

public class MockInput implements Input {
    private final String[] answers;
    private int position;

    public MockInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ascStr(String question) {
        return answers[position++];
    }

    @Override
    public int ascInt(String question) {
        return Integer.parseInt(ascStr(question));
    }
}
