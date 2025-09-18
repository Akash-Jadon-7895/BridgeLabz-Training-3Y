import java.util.*;

class Book {
    static String libraryName = "Default Library";
    final String isbn;
    String title;
    String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book.libraryName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String isbn = sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            Book b = new Book(isbn, title, author);
            b.displayDetails();
        }
        Book.displayLibraryName();
    }
}