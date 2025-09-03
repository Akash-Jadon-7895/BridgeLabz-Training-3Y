import java.util.*;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        double size = sc.nextDouble();
        sc.nextLine();
        EBook eb = new EBook(isbn, title, author, size);
        eb.displayEBookDetails();
        String newAuthor = sc.nextLine();
        eb.setAuthor(newAuthor);
        eb.displayEBookDetails();
    }
}
