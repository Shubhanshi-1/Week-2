
class MobilePhones {
     String brand;
	String model;
	 double price;
	
	
    // Constructor
     public MobilePhones(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display Mobile phone Details
    void displayMobilePhoneDetails() {
        System.out.println("Brand name: " + brand + " Model name: " + model + "  price: " + price);
    }
	
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
	
        MobilePhones mobile = new MobilePhones("OPPO", "A74 5g", 17499);
        mobile.displayMobilePhoneDetails();  // calling the method to display the mobile phone details
		
    }
}



