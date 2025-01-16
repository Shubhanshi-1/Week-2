//Import java util package for Scanner class
import java.util.*;
class Items {
     String itemcode;
	String itemname;
	 double price;
	
	
    // Constructor
     public Items(String itemcode, String itemname, double price) {
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.price = price;
    }

    // Method to display Item Details
    void displayItemDetails() {
        System.out.println("Itemcode: " + itemcode + " Itemname: " + itemname + " Item price: " + price);
    }
	//Method to calculate total price for given Quantity
	void calculatePrice(int quantity){
	   double totalprice = quantity*price;
	   System.out.println("The price for "+quantity+" products is: "+totalprice);
}
}

public class ItemDetails {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int quantity = sc.nextInt();
        Items item = new Items("ITCODE1", "Headphones", 549);
        item.displayItemDetails();  // calling the method to display the item details
		item.calculatePrice(quantity); //Calling the method to calculate the price for given quantity
    }
}



