package LMSLLD;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;

    }

    public String isbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned successfully.");
    }

}
