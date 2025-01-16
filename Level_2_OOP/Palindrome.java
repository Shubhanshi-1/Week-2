//Import java util package for Scanner
import java.util.*;
  class PalindromeChecker{
  boolean flag = true;
     String text;
    
	// Constructor of palindrome checker class
   public PalindromeChecker(String text){
	   this.text=text;
   }
    
	//Method to check if the text is palindrome
	void palindromeChecker(String text){
		int start=0;
		int end =text.length()-1;
		while(start<=end){
		   if(text.charAt(start)!=text.charAt(end)){
		   flag=false;
		   break;
		   }
		   start++; 
		   end--;
	}
	}
	
	   //Method to display Result
	    void displayResult(){
		if(flag)System.out.println("This is a palindrome");
		else System.out.println("This is not a palindrome");
	}
  }
	
	public class Palindrome{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			//Asking user to enter text
			System.out.println("Enter a text");
			String text = sc.nextLine();
			text= text.toLowerCase();
			PalindromeChecker palindrome = new PalindromeChecker(text);
			// Calling the method to check palindrome
			palindrome.palindromeChecker(text);
			//Calling the method to display the result
			palindrome.displayResult();
			
		}
	}
	
		
	   
 