package LMSLLD;

public class Main {

    public static void main(String[] args) {
        System.out.println("Library Management System Low Level Design");
        Library library = new Library();

        Book book1 = new Book("The Greategetsby", "F. Scott Fitzgerald", "12345");
        Book book2 = new Book("The Beauty of Nature", "Youva", "12346");

        library.addBook(book1);
        library.addBook(book2);

        User user = new User("Alice",101);

        // Show Available books
        // System.out.println("Show Available Books");
        library.displayAvailableBooks();

        user.borrowBook(book1);

        library.displayAvailableBooks();

        // user.returnBook(book1);

        // library.displayAvailableBooks();

    }

}
