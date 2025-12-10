package org.example;

import org.example.factory.BookFactory;
import org.example.model.Book;
import org.example.service.LibraryService;
import org.example.service.impl.LibraryServiceImpl;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Book Library Application!");

        LibraryService library = new LibraryServiceImpl();

        // Using Factory Pattern to create books
        Book b1 = BookFactory.createBook("fiction", "The Hobbit", "J.R.R. Tolkien", 15.99);
        Book b2 = BookFactory.createBook("non-fiction", "Sapiens", "Yuval Noah Harari", 20.50);

        library.addBook(b1);
        library.addBook(b2);

        System.out.println("Book added!" + "Book 1 is : " + b1);
        System.out.println("Book added!" + "Book 2 is : " + b2);

    }
}