public class Book{
        String title;
        String author;
        int price;

        Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        Book() {
        }
    
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", 500);
        Book book2 = new Book();

        System.out.println("Book 1: " + book1.title + ", " + book1.author + ", " + book1.price);
        System.out.println("Book 2: " + book2.title + ", " + book2.author + ", " + book2.price); 
    }
}
