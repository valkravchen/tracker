package com.example.oop.interfaces_27.experiment5;

public interface ReadWritable extends Readable, Writable {
    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();
        ReadWritable readWritable = new ReadWritable() {
            @Override
            public String read() {
                return content.toString();
            }

            @Override
            public void write(String data) {
                System.out.println("Записываем: " + data);
                content.append(data);
            }
        };
        readWritable.write("Hello");
        readWritable.write(" World");
        System.out.println("Читаем: " + readWritable.read());
    }
}
