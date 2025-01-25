package HierarchicalInheritence.BankAccountTypes;

// Child class of BankAccount class
class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }
    // Method to display Account type
    void displayAccountType(){
        System.out.println("Account Type: FixedDepositAccount");
        super.displayAccountType(); // Calling method of parent class
    }
}
