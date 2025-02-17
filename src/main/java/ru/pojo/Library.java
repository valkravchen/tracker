package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 464);
        Book cleanCoder = new Book("The Clean Coder", 256);
        Book cleanArchitecture = new Book("Clean Architecture", 352);
        Book cleanAgile = new Book("Clean Agile", 272);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = cleanCoder;
        books[2] = cleanArchitecture;
        books[3] = cleanAgile;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Robert Martin: " + book.getBookTitle() + " - " + book.getPageCount() + " pages.");
        }
        System.out.println("Rearranging books.");
        books[0] = cleanAgile;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Robert Martin: " + book.getBookTitle() + " - " + book.getPageCount() + " pages.");
        }
        System.out.println("Clean code.");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getBookTitle().equals("Clean Code")) {
                System.out.println("Robert Martin: " + book.getBookTitle() + " - " + book.getPageCount() + " pages.");
            }
        }
    }
}

