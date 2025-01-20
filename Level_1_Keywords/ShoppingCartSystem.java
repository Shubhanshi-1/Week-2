class Product {
    // Static variable shared across all products
    static double discount = 10.0; // Default discount percentage

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final String productID; // Using final keywrod to ensure the product id cannot be modified

    // Constructor to initialize product details
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Implement method to calculate the total price after discount
    public double calculateTotalPrice() {
        double discountedPrice = price - (price * discount / 100);
        return discountedPrice * quantity;
    }

    // Implement method to display product details
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product Details:");
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discounted Total: $" + calculateTotalPrice());
        } else {
            System.out.println("Invalid object. Not an instance of Product.");
        }
    }
}
  public class ShoppingCartSystem{
    public static void main(String[] args) {
        // Update and display discount
        Product.updateDiscount(15.0);

        // Create product instances
        Product product1 = new Product("Laptop", 1200.0, 1, "P1001");
        Product product2 = new Product("Headphones", 150.0, 2, "P1002");
        Product product3 = new Product("Mouse", 25.0, 3, "P1003");

        // Display product details
        product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();
    }
}
