package org.example.model;

public abstract class Book {
    public String book_name;
    public String author;
    public double price;

    public Book(String book_name, String author, double price) {
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }
    public String getBook_name() {
        return book_name;
    }
   public void setBook_name(String book_name) {
        this.book_name = book_name;
   }
   public String getAuthor() {
        return author;
   }
   public void setAuthor(String author) {
        this.author = author;
   }
   public double getPrice() {
        return price;
   }
   public void setPrice(double price) {
        this.price = price;
   }
}
