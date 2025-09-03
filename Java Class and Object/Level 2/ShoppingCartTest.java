import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int qty) {
        items.add(new CartItem(name, price, qty));
    }

    void removeItem(String name) {
        items.removeIf(i -> i.itemName.equalsIgnoreCase(name));
    }

    void displayTotal() {
        double total = 0;
        for (CartItem i : items) {
            total += i.getTotal();
        }
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCartTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;
        do {
            choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();
                String name = sc.nextLine();
                double price = sc.nextDouble();
                int qty = sc.nextInt();
                cart.addItem(name, price, qty);
            } else if (choice == 2) {
                sc.nextLine();
                String name = sc.nextLine();
                cart.removeItem(name);
            } else if (choice == 3) {
                cart.displayTotal();
            }
        } while (choice != 4);
    }
}
