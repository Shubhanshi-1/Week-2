package BankingSystem;

public class SavingAccount extends BankAccount implements Loanable{
    private boolean isEligible=false;
    public SavingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest(int year) {
          return  getBalance()*year*0.08;
    }

    @Override
    public void applyforLoan() {
     if(isEligible)System.out.println("Applied for Loan");
     else System.out.println("Not Eligible");
    }

    @Override
    public void calculateLoanEligibility() {
       if(getBalance()>10000) {
           System.out.println("Eligible for Loan");
           isEligible=true;
       }
       else System.out.println("Not eligible");
    }

}
