package org.example;

import org.example.factory.BookFactory;
import org.example.model.Book;
import org.example.util.ReflectionUtil;

public class ReflectionTest {

    void testReflection() {
        Book book = BookFactory.createBook("fiction", "Test", "Author", 10);
        ReflectionUtil.inspectObject(book);
    }
}
