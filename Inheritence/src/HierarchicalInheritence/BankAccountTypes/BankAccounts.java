package HierarchicalInheritence.BankAccountTypes;

// Main class
class BankAccounts{
    public static void main(String args[]){
        // Method call
        SavingAccount saving = new SavingAccount("SBI123xx45",54049,10);
        saving.displayAccountType();
        CheckingAccount checking = new CheckingAccount("SBI1235",567889,10000);
        checking.displayAccountType();
        FixedDepositAccount fixed = new FixedDepositAccount("SBI789",568864);
        fixed.displayAccountType();
    }
}

