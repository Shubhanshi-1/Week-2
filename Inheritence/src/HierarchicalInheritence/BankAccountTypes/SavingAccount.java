package HierarchicalInheritence.BankAccountTypes;

class SavingAccount extends BankAccount{
    double interestRate;

    SavingAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    // Method to display account type
    void displayAccountType(){
        System.out.println("Account type: Saving");
        super.displayAccountType();// calling method of parent class
        System.out.println("Interest Rate: "+interestRate+"%");
    }

}
