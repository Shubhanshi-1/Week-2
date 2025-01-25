package ECommercePlatform;

// Main class to test the e-commerce platform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating products
        Product electronics = new Electronics(1, "Smartphone", 50000);
        Product clothing = new Clothing(2, "T-Shirt", 2000);
        Product groceries = new Groceries(3, "Rice", 1000);

        // Adding products to the list
        Product[] products = {electronics, clothing, groceries};

        // Displaying final price for each product
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------------");
        }
    }
}