package com.example.oop.interfaces.experiment6;

public class File implements ReadWritable {
    private String content;

    public File(String initialContent) {
        this.content = initialContent;
    }

    @Override
    public String read() {
        return content;
    }

    @Override
    public void write(String data) {
        content = data;
        System.out.println("Записано: " + data);
    }

    public static void main(String[] args) {
        File file = new File("исходные данные");
        file.copy();
        System.out.println("Содержимое файла: " + file.read());
    }
}
