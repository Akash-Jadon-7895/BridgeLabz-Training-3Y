import java.util.*;

abstract class Account {
    private final String accountNumber;
    protected double balance;
    protected String owner;

    public Account(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void credit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance, String owner) {
        super(accountNumber, balance, owner);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance, String owner) {
        super(accountNumber, balance, owner);
    }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
}

interface LoanOperations {
    void approveLoan();
    double calculateEMI();
    void closeLoan();
}

class RepaymentSchedule {
    private double monthlyEMI;
    private int remainingMonths;

    public RepaymentSchedule(double monthlyEMI, int remainingMonths) {
        this.monthlyEMI = monthlyEMI;
        this.remainingMonths = remainingMonths;
    }

    public double getMonthlyEMI() {
        return monthlyEMI;
    }

    public int getRemainingMonths() {
        return remainingMonths;
    }

    public void reduceMonth() {
        if (remainingMonths > 0) {
            remainingMonths--;
        }
    }

    public boolean isCompleted() {
        return remainingMonths == 0;
    }
}

abstract class Loan implements LoanOperations {
    protected static double interestRate = 0.08;
    protected Customer customer;
    protected double principal;
    protected int tenureMonths;
    protected RepaymentSchedule schedule;
    protected boolean isApproved = false;

    public Loan(Customer customer, double principal, int tenureMonths) {
        this.customer = customer;
        this.principal = principal;
        this.tenureMonths = tenureMonths;
    }

    public RepaymentSchedule getSchedule() {
        return schedule;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void closeLoan() {
        schedule = null;
        isApproved = false;
    }
}

class HomeLoan extends Loan {
    public HomeLoan(Customer customer, double principal, int tenureMonths) {
        super(customer, principal, tenureMonths);
    }

    public void approveLoan() {
        isApproved = true;
        double emi = calculateEMI();
        schedule = new RepaymentSchedule(emi, tenureMonths);
    }

    public double calculateEMI() {
        double r = interestRate / 12;
        return (principal * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
    }
}

class CarLoan extends Loan {
    public CarLoan(Customer customer, double principal, int tenureMonths) {
        super(customer, principal, tenureMonths);
    }

    public void approveLoan() {
        isApproved = true;
        double emi = calculateEMI();
        schedule = new RepaymentSchedule(emi, tenureMonths);
    }

    public double calculateEMI() {
        double r = (interestRate + 0.01) / 12;
        return (principal * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
    }
}

class PersonalLoan extends Loan {
    public PersonalLoan(Customer customer, double principal, int tenureMonths) {
        super(customer, principal, tenureMonths);
    }

    public void approveLoan() {
        isApproved = true;
        double emi = calculateEMI();
        schedule = new RepaymentSchedule(emi, tenureMonths);
    }

    public double calculateEMI() {
        double r = (interestRate + 0.02) / 12;
        return (principal * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
    }
}

class LoanManager {
    public static void autoDebitEMI(List<Loan> loans) {
        for (Loan loan : loans) {
            if (!loan.isApproved() || loan.getSchedule().isCompleted()) continue;
            double emi = loan.getSchedule().getMonthlyEMI();
            boolean success = false;
            for (Account account : loan.getCustomer().getAccounts()) {
                if (account.debit(emi)) {
                    success = true;
                    loan.getSchedule().reduceMonth();
                    break;
                }
            }
            if (!success) {
                System.out.println("EMI debit failed for customer: " + loan.getCustomer().getName());
            }
        }
    }
}
public class BankingAndLoanManagementSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Akash");
        Account savings1 = new SavingsAccount("SA1001", 5000, "Akash");
        Account current1 = new CurrentAccount("CA1001", 2000, "Akash");
        customer1.addAccount(savings1);
        customer1.addAccount(current1);

        Customer customer2 = new Customer("Bablu");
        Account savings2 = new SavingsAccount("SA1002", 3000, "Bablu");
        customer2.addAccount(savings2);

        Loan homeLoan = new HomeLoan(customer1, 100000, 12);
        homeLoan.approveLoan();

        Loan carLoan = new CarLoan(customer2, 50000, 10);
        carLoan.approveLoan();

        List<Loan> loans = Arrays.asList(homeLoan, carLoan);

        for (int month = 1; month <= 12; month++) {
            System.out.println("Month: " + month);
            LoanManager.autoDebitEMI(loans);
            for (Loan loan : loans) {
                System.out.println("Customer: " + loan.getCustomer().getName() +
                        ", Remaining Months: " + loan.getSchedule().getRemainingMonths() +
                        ", Monthly EMI: " + loan.getSchedule().getMonthlyEMI());
            }
            System.out.println();
        }
    }
}