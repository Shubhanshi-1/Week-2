package HierarchicalInheritence.BankAccountTypes;

class BankAccount{
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber= accountNumber;
        this.balance=balance;
    }
    // Method to display account type
    void displayAccountType(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Total balance: "+balance);
    }
}
