import java.util.*;

class Product {
    static double discount = 0.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetails() {
        if (this instanceof Product) {
            double total = price * quantity;
            double discountedTotal = total - (total * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total (after discount): " + discountedTotal);
        }
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double newDiscount = sc.nextDouble();
        sc.nextLine();
        Product.updateDiscount(newDiscount);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            sc.nextLine();
            Product p = new Product(id, name, price, qty);
            p.displayDetails();
        }
    }
}