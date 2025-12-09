package org.example.model;

public class FictionBook extends Book{
    public FictionBook(String book_name, String author, double price) {
        super(book_name, author, price);
    }
    @Override
    public String toString() {
        return "Fiction Book";
    }
}
