package org.example.service.impl;

import org.example.model.Book;
import org.example.repository.LibraryRepository;
import org.example.service.LibraryService;



public class LibraryServiceImpl implements LibraryService {
    private final LibraryRepository libraryRepository=LibraryRepository.getInstance();


    @Override
    public void addBook(Book book) {
        libraryRepository.addBook(book);

    }

    public void printExpensiveBooks() {
        libraryRepository.getBooks().stream()
                .filter(book -> book.getPrice() > 15)
                .map(Book::getBook_name)
                .forEach(System.out::println);
    }

}
