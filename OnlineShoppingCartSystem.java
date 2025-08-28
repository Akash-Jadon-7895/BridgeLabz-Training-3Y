import java.util.Scanner;
public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        System.out.println(("Welcome to the Online Shopping Cart System"));
        System.out.println("Available Products: 1. T-shirt (1500 rs.) 2. Shirt (4000 rs.) 3. Shoes (2000 rs.) 4. Watch (5000 rs.) 5. Bag (3000 rs.) 6. Jeans (3500 rs.)");
        Scanner sc = new Scanner(System.in);
        boolean continueShopping = true;
        while(continueShopping){
            int totalAmount = 0;
            int items[] = new int[10000];
            for(int i = 0; i < 10000; i++){
                System.out.println("What item you want to add to your cart? (1-6): ");
                items[i] = sc.nextInt();
                System.out.println("Do you want to add more items? (1-Yes / 0-No)");
                if(sc.nextInt() == 0){
                    break;
                }
            }
            for(int i = 0; i < items.length; i++){
                switch (items[i]) {
                    case 1:
                        totalAmount += 1500;
                        break;
                    case 2:
                        totalAmount += 4000;
                        break;
                    case 3:
                        totalAmount += 2000;
                        break;
                    case 4:
                        totalAmount += 5000;
                        break;
                    case 5:
                        totalAmount += 3000;
                        break;
                    case 6:         
                        totalAmount += 3500;
                        break;
                    default:
                        break;
                }
            }
            if(totalAmount > 5000){
                System.out.println("Congratulations! You get a 10% discount.");
                totalAmount = (int)(totalAmount * 0.9);
            }
            System.out.println("Final Bill Amount = rupees " + totalAmount);
            System.out.println("Do you want to shop again? (1-Yes / 0-No)");
            if(sc.nextInt() == 0){
                continueShopping = false;
            }
    }
        System.out.println("Thank you for shopping with us!");
        sc.close();
    }
}
