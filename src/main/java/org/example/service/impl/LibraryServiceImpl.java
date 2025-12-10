package org.example.service.impl;

import org.example.model.Book;
import org.example.service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private List<Book> books = new ArrayList<>();
    @Override
    public void addBook(Book book) {
        books.add(book);

    }
}
