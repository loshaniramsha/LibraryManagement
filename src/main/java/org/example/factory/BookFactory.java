package org.example.factory;

import org.example.model.Book;
import org.example.model.FictionBook;
import org.example.model.NonFictionBook;

public class BookFactory {
    public static Book createBook(String type,String title, String author, double price) {
        return switch (type.toLowerCase()) {
            case "fiction" -> new FictionBook(title, author, price);
            case "non-fiction" -> new NonFictionBook(title, author, price);
            default -> throw new IllegalArgumentException("Unsupported book type: " + type);
        };
    }
}
