package com.example.oop;

public class LibraryBook {
    private String bookId;
    private String title;
    private double rentalPrice;
    private static int nextBookId;

    static {
        nextBookId = 1000;
    }

    {
        bookId = "Книга № " + nextBookId++;
    }

    public LibraryBook(String title, double rentalPrice) {
        this.title = validateTitle(title) ? title : "некорректное название";
        this.rentalPrice = validateRentalPrice(rentalPrice) ? rentalPrice : 5.0;
    }

    public LibraryBook(String title) {
        this(title, 5.0);
    }

    private boolean validateTitle(String title) {
        return title != null && !title.trim().isEmpty();
    }

    private boolean validateRentalPrice(double price) {
        return price >= 0.0;
    }

    public String getBookInfo() {
        return "Книга: № " + bookId + "; название книги: \"" + title +
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
            this.recordId = (bookId != null && bookId.trim().isEmpty() ? "REC: " + bookId : "REC_Invalid");
        }

        public String getRecordInfo() {
            return "Запись ареды: № " + recordId;
        }
    }
}
