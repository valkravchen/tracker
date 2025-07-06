package com.example.oop.Inheritance;

public class Document implements Printable {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = validateTitle(title);
        this.content = validateContent(content);
    }

    private String validateTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Заголовок не может быть null или пустой строкой");
        }
        return title;
    }

    private String validateContent(String content) {
        if (content == null || content.trim().isEmpty()) {
            throw new IllegalArgumentException("Содержимое не может быть null или пустой строкой");
        }
        return content;
    }

    @Override
    public String print() {
        return "Печать документа: " + title + ", содержимое: " + content;
    }

    @Override
    public String getPreview() {
        return "Предпросмотр документа: " + title;
    }

    public String getDefaultPreview() {
        return Printable.super.getPreview();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
