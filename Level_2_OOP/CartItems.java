// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CartItem Class
class CartItem{
	String itemName;
	int quantity;
	double price;
	int totalCost=0;
	
	CartItem (String itemName,int quantity, double price){
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
	}
	void addToCart(){
		
			// Importing Scanner class from util package for user input
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			
			// Asking the user to enter the name
			System.out.println("Enter the name of the item for adding to cart");
			String itemName=scanner.nextLine();

			// Asking the user to enter the quantity
			System.out.println("Enter the quantity");
			int quantity=scanner.nextInt();
			
			// Asking the user to enter the price
			System.out.println("Enter the Price");
			double price=scanner.nextDouble();
			totalCost+=price*quantity;
	}
	void removeFromCart(){
		
			// Creating a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			
			// Asking the user to enter the name
			System.out.println("Enter the name of the item for removal from cart");
			String itemName= scanner.nextLine();
			
			// Asking the user to enter the quantity
			System.out.println("Enter the quantity");
			int quantity=scanner.nextInt();
			
			// Asking the user to enter the price
			System.out.println("Enter the Price");
			double price=scanner.nextDouble();
			totalCost-=price*quantity;
	}
	
	void totalCost(){
		totalCost+=price*quantity;
		System.out.println("The total price is: "+totalCost);
	}
}
public class CartItems{
		public static void main(String args[]){
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Asking the user to enter the name of the item
			System.out.println("Enter the Item name");
			String itemName= scanner.nextLine();
			
			// Asking the user to enter the quantity
			System.out.println("Enter the quantity");
			int quantity=scanner.nextInt();
			
			// Asking the user to enter the price
			System.out.println("Enter the Price");
			double price=scanner.nextDouble();
			
			// Creating object of CartItem class
			CartItem cart = new CartItem(itemName,quantity,price);
			
			//Method calling
			cart.addToCart();
			cart.removeFromCart();
			cart.totalCost();
		
			// Close the scanner
			scanner.close();
		}
	}
	