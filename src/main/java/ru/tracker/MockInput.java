package ru.tracker;

public class MockInput implements Input{
    @Override
    public String ascStr(String question) {
        return "";
    }

    @Override
    public int ascInt(String question) {
        return 0;
    }
}
