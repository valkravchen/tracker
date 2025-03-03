package ru.poly;

public class MemStore implements Store {
    private String[] mem = new String[100];
    private int size = 0;

    public void save(String data) {
        mem[size++] = data;
    }

    public String read() {
        StringBuilder buff = new StringBuilder();
        for (int index = 0; index < size; index++) {
            buff.append(mem[index]);
        }
        return buff.toString();
    }
}
