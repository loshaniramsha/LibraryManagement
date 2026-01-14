package org.example.repository;

import org.example.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    private static LibraryRepository instance;
    private final List<Book> books = new ArrayList<>();

    private LibraryRepository() {}

    public static LibraryRepository getInstance() {
        if (instance == null) {
            instance = new LibraryRepository();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
