public class Book2 {
    String title;
    String author;
    int price;  
    Boolean isAvailable;
    Book2(String title, String author, int price, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    public Book2  borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return new Book2(title, author, price, isAvailable);
        } else {
            System.out.println("Sorry, the book is not available for borrowing.");
            return null;
        }
    }
    public static void main(String[] args) {
        Book2 book1 = new Book2("XYZ", "abc", 500, true);
        Book2 borrowedBook = book1.borrowBook();
        if (borrowedBook != null) {
            System.out.println("Borrowed Book: " + borrowedBook.title + ", " + borrowedBook.author + ", " + borrowedBook.price + ", Available: " + borrowedBook.isAvailable);
        }
        Book2 secondAttempt = book1.borrowBook();
        if (secondAttempt != null) {
            System.out.println("Borrowed Book: " + secondAttempt.title + ", " + secondAttempt.author + ", " + secondAttempt.price + ", Available: " + secondAttempt.isAvailable);
        }
}}
