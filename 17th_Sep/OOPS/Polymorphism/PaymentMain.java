package OOPS.Polymorphism;
import java.util.*;

class Payment {
    void pay(double amount){
        System.out.println("Paying "+amount+" using default payment method");
    }
}

class CreditCard extends Payment{
    void pay(double amount){
        System.out.println("Paid "+amount+" using Credit Card");
    }
}

class DebitCard extends Payment{
    void pay(double amount){
        System.out.println("Paid "+amount+" using Debit Card");
    }
}

class UPI extends Payment{
    void pay(double amount){
        System.out.println("Paid "+amount+" using UPI");
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Payment payment;
        System.out.println("Which method do you prefer for payment");
        System.out.println("1.Credit Card");
        System.out.println("2.Debit Card");
        System.out.println("3.UPI");
        int choice=sc.nextInt();
        System.out.println("Enter the amount");
        double amount=sc.nextDouble();
        switch(choice){
            case 1:
                payment=new CreditCard();
                payment.pay(amount);
                break;
            case 2:
                payment=new DebitCard();
                payment.pay(amount);
                break;
            case 3:
                payment=new UPI();
                payment.pay(amount);
                break;
            default:
                System.out.println("You made a invalid choice");
        }
    }
}