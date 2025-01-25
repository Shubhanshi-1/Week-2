package BankingSystem;

public class BankingSystem {
    public static void main(String args[]){
        BankAccount savingAccount = new SavingAccount("SBI2526","Shubhanshi",55000);
        BankAccount currentAccount = new CurrentAccount("CBI2224","Rishav",70000);

        savingAccount.calculateLoanEligibility();
        savingAccount.applyforLoan();
        System.out.println("Interest: "+savingAccount.calculateInterest(3));

        currentAccount.calculateLoanEligibility();
        currentAccount.applyforLoan();
        System.out.println("Interest: "+currentAccount.calculateInterest(4));


    }
}
