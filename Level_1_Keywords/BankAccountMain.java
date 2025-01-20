class BankAccount{
	
	// Static variable shared accross all accounts
    private static String bankName = "State Bank of India";
	private static int totalAccount=0;
	
	//Instance variable
	private String accountHolderName;
	private double balance;
	
	//Final variable 
    private final int accountNumber;
	
	// Constructor
	public BankAccount(String accountHolderName, int accountNumber, double initialBalance){
		this.accountHolderName = accountHolderName;// Using this to resolve ambiguity
		this.accountNumber = accountNumber; // Final variable initialized
		this.balance = initialBalance;
		
		totalAccount++;
		
	}
	
	// Static method to display total accounts
	public static void getTotalAccounts(){
		System.out.println("The total accounts in "+bankName+" : "+totalAccount);
		
	}
	
	//
	public void displayAccountDetails(){
		if(this instanceof BankAccount){
		System.out.println("Bank name: "+bankName);
	    System.out.println("Account Holder: "+accountHolderName);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Balance: "+balance);
		} else {
			System.out.println("This object is not an instance of BankAccount");
		}
		 }

    // Implement method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Implement method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
     public class BankAccountMain{
    public static void main(String[] args) {
        // Creating multiple bank accounts
        BankAccount account1 = new BankAccount("Alice", 101, 5000.0);
        BankAccount account2 = new BankAccount("Bob", 102, 3000.0);

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Depositing and withdrawing money
        account1.deposit(2000.0);
        account1.withdraw(1000.0);

        // Displaying total accounts
        BankAccount.getTotalAccounts();
    }
}

	
	
	