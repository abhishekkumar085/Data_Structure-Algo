package LMSLLD;

import java.util.*;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println(book.getTitle() + " removed from the library.");
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books:");
        // if (books == null || books.isEmpty()) {
        //     System.out.println("No books available.");
        //     return;
        // }
        for (Book book : books) {
            System.out.println("Checking book: " + book.getTitle());
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

}
