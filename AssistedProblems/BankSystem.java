import java.util.ArrayList;

// Account class
class Account {
    private int accountNumber;
    private double balance;

    // Constructor of account class
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Implement method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Implement method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Implement ethod to view balances
    public void viewBalances() {
        System.out.println("Customer: " + name + "'s Account Balances:");
        for (Account account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + ": " + account.getBalance());
        }
    }
}

// Bank class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Implement method to add a customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Implement method to open an account for a customer
    public void openAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        customer.addAccount(account);
        System.out.println("Account " + account.getAccountNumber() + " opened for " + customer.name + " at " + name);
    }

    // Displaying bank customers
    public void displayCustomers() {
        System.out.println("Customers at " + name + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.name);
        }
    }
}

// Main class to demonstrate the association relationship
public class BankSystem {
    public static void main(String[] args) {
        // Creating a bank
        Bank bank = new Bank("National Bank");

        // Creating customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Creating accounts
        Account account1 = new Account(101, 500.0);
        Account account2 = new Account(102, 1000.0);
        Account account3 = new Account(103, 1500.0);

        // Associating customers and accounts with the bank
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // Displaying customer details
        bank.displayCustomers();
        customer1.viewBalances();
        customer2.viewBalances();
    }
}
