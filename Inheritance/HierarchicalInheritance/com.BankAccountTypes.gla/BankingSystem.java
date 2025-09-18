package com.BankAccountTypes.gla;
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000, 24);
        sa.displayAccountType();
        System.out.println("--------------------");
        ca.displayAccountType();
        System.out.println("--------------------");
        fda.displayAccountType();
        
    }
}