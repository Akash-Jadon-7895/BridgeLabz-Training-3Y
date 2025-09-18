package OOPS.Encapsulation;

import java.util.Scanner;

public class BankAccount {

    private int  AccountNumber;
    private int Balance;
    private int Pin;

    BankAccount(int AccountNumber , int Balance , int Pin){
        this.Pin = Pin;
        this.Balance = Balance;
        this.AccountNumber = AccountNumber;
    }

    void  deposit(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Pin : ");
        int Enter_Pin = scn.nextInt();

        if( Enter_Pin == Pin)
        {
            if(Balance<0){
                System.out.println("Invalid Balance !");
            }
            else{
                System.out.println("Enter the deposit Amount : ");
                int reduce_bal = scn.nextInt();
                Balance-=reduce_bal;
                System.out.println("Amount deposited successfully !!");
                System.out.println("Remaining Balance :"+ Balance);
            }
        }
        else{
            System.out.println("Invalid Pin");
            deposit();
        }
    }

    void  credit(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Credit Amount : ");
        int credit_Amount = scn.nextInt();

        Balance+= credit_Amount;
        System.out.println("Amount credit Successfully !!");
        System.out.println("Remaining Balance :"+ Balance);
    }


    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public int getBalance(){
        return Balance;
    }

    public void setBalance(int Balance){
        this.Balance = Balance;
    }

    public int getPin(){
        return Pin;
    }

    public void setPin(int Pin){
        this.Pin = Pin;
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(123456,5000,1234);
        System.out.println("Account Number : "+b1.getAccountNumber());
        System.out.println("Balance : "+b1.getBalance());
        b1.deposit();
        b1.credit();
    }
}