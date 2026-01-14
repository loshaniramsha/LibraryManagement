package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String name;
    private String category;

    public Book(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Category: " + category;
    }
}

public class Main {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Login Menu ---");
            System.out.println("1. Login as User");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    userMenu();
                    break;
                case "2":
                    adminMenu();
                    break;
                case "3":
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void userMenu() {
        while (true) {
            System.out.println("\n--- User Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Books");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    searchBooks();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. View All Books");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Books");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    viewAllBooks();
                    break;
                case "2":
                    deleteBook();
                    break;
                case "3":
                    searchBooks();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter book name: ");
        String name = scanner.nextLine();
        System.out.print("Enter book category: ");
        String category = scanner.nextLine();
        books.add(new Book(name, category));
        System.out.println("Book added successfully.");
    }

    private static void searchBooks() {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Book book : books) {
            if (book.getName().toLowerCase().contains(keyword) ||
                book.getCategory().toLowerCase().contains(keyword)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    private static void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\n--- Book List ---");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ". " + books.get(i));
        }
    }

    private static void deleteBook() {
        viewAllBooks();
        if (books.isEmpty()) return;
        System.out.print("Enter index of book to delete: ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < books.size()) {
                books.remove(index);
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Invalid index.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}

