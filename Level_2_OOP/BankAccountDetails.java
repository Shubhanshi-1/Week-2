import java.util.*;
  class BankAccount{
     String accountholder;
     String accountnumber;
     long balance;
  
   public BankAccount(String accountholder,String accountnumber,long balance){
	   this.accountholder =accountholder;
	   this.accountnumber = accountnumber;
	   this.balance = balance;
   }
    
	void displayCurrentBalance(){
		System.out.println("Current balance is: "+balance);
	}
	 
	void depositingMoney(Long money){
		balance+=money;
		displayCurrentBalance();
	}
	void withdrawMoney(Long money){
		if(money>balance){
			System.out.println("INSUFFICIENT BALANCE!!!");
		}
		else{
			balance-=money;
			displayCurrentBalance();
		}
	}
  }
	
	public class BankAccountDetails{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
		    BankAccount bank = new BankAccount("Shubhanshi Verma", "575089XXXX", 40000000);
			 
			System.out.println("Enter 1 to see current balance");
			System.out.println("Enter 2 to deposite money");
			System.out.println("Enter 3 to withdraw money");
			int input = sc.nextInt();
			long money =0l;
			
			if(input<1&& input>3) System.out.println("Invalid Input");
			else if(input!=1) {
				System.out.println("Enter amount");
				 money = sc.nextLong();
			}
			
			if(input==1) bank.displayCurrentBalance();
			else if(input ==2) bank.depositingMoney(money);
			else bank.withdrawMoney(money);
		}
	}
		
	   
 