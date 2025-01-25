package HierarchicalInheritence.BankAccountTypes;

// Child class of BankAccount class
class CheckingAccount extends BankAccount{
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance,double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    //Method to display Account type
    void displayAccountType(){
        System.out.println("Account type: Checking Account");
        super.displayAccountType();// Calling method of parent class
        System.out.println("Withdrawal Limit is: "+withdrawalLimit);
    }
}

