package BankingSystem;

import javax.sound.midi.SysexMessage;

public class CurrentAccount extends BankAccount implements Loanable {
    private boolean isEligible=false;
    public CurrentAccount(String accountNumber, String accountNumber2, double balance) {
        super(accountNumber, accountNumber2, balance);
    }

    @Override
    public double calculateInterest(int time) {
       return getBalance()*time*0.08;
    }

    @Override
    public void applyforLoan() {
        if(isEligible)System.out.println("Applied for loan");
        else System.out.println("Not Eligible");
    }

    @Override
    public void calculateLoanEligibility() {
     if(getBalance()>60000) {
         System.out.println("Eligible for loan");
                 isEligible=true;
     }
     else System.out.println("Not Eligible");
    }
}
