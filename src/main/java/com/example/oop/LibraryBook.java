package com.example.oop;

public class LibraryBook {
    private String bookId;
    private String title;
    private String ex;
    private double rentalPrice;
    private static int nextBookId;

    static {
        nextBookId = 1000;
    }

    {
        bookId = "книга № " + nextBookId++;
    }

    public LibraryBook(String title, double rentalPrice) {
        this.title = validateTitle(title) ? title : "некорректное название";
        this.rentalPrice = validateRentalPrice(rentalPrice) ? rentalPrice : 5.0;
    }

    public LibraryBook(String title) {
        this(title, 5.0);
    }

    public LibraryBook() {
        this("Без названия", 5.0);
    }

    private boolean validateTitle(String title) {
        return title != null && !title.trim().isEmpty();
    }

    private boolean validateRentalPrice(double price) {
        return price >= 0.0;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookInfo() {
        return "Информация о книге: " + bookId + "; название книги: \"" + title +
                "\"; стоимость аренды: " + rentalPrice;
    }

    public void updateRentalPrice(double newPrice) {
        rentalPrice = validateRentalPrice(newPrice) ? newPrice : 5.0;
    }

    @Override
    public String toString() {
        return getBookInfo();
    }

    public static class RentalRecord {
        private String recordId;

        public RentalRecord(String bookId) {
            this.recordId = (bookId != null && !bookId.trim().isEmpty()) ? "REC: " + bookId : "REC_Invalid";
        }

        public String getRecordInfo() {
            return "Запись ареды: № " + recordId;
        }
    }

    public static void main(String[] args) {
        LibraryBook libraryBook1 = new LibraryBook("Java Programming", 10.0);
        LibraryBook libraryBook2 = new LibraryBook("Python Guide");
        LibraryBook libraryBook3 = new LibraryBook();
        libraryBook2.updateRentalPrice(15.0);
        RentalRecord rentalRecord = new RentalRecord(libraryBook1.getBookId());
        System.out.println(libraryBook1.getBookInfo());
        System.out.println(libraryBook2.getBookInfo());
        System.out.println(libraryBook3.getBookInfo());
        System.out.println(rentalRecord.getRecordInfo());
        LibraryBook libraryBook5 = new LibraryBook("", -3);
        System.out.println(libraryBook5.getBookInfo());
    }
}
