class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor of bank account class
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Using getter for balance
    public double getBalance() {
        return balance;
    }

    // Using setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass to demonstrate access to public and protected members
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Balance: " + getBalance()); // Accessing private member through getter
    }

    
}


public class BankAccountManagement {
	// Main method
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, "Bob", 5000.00);
        savings.displayDetails();
    }
}