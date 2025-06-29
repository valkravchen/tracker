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
}
