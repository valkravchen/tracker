package ru.concat;

public class StringJoinerExample {
    public static void main(String[] args) {
        long startBuffer = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
            buffer.append(i);
        }
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - startBuffer) + " мс");
        long startBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            builder.append(i);
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - startBuilder) + " мс");
    }
}

