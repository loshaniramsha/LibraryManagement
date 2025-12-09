package org.example.model;

public class NonFictionBook extends Book{
    public NonFictionBook(String book_name, String author, double price) {
        super(book_name, author, price);
    }
    @Override
    public String toString() {
        return "NonFiction Book";
    }
}
