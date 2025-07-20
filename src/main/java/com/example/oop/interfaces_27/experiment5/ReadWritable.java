package com.example.oop.interfaces_27.experiment5;

public interface ReadWritable extends Readable, Writable {
    StringBuilder content = new StringBuilder();

    public static void main(String[] args) {

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
