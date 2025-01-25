package BankingSystem;

public abstract class BankAccount implements Loanable{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance= balance;
    }

    //Getter and Setter method
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    //abstract method
    public abstract double calculateInterest(int year);

    //Concrete method
    public void depositMoney(double amount){
          balance+=amount;
    }
    public void withdrawMoney(double amount){
        if(amount>balance)System.out.println("Insufficient Balance");
        else balance-=amount;
    }

    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder name: "+accountHolder);
        System.out.println("Current balance: "+balance);
    }
}
