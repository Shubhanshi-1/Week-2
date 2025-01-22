import java.util.ArrayList;

// Product class
class Product {
    private String name;
    private double price;

    // Constructor of product class
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Create a method to display product details
    public void displayProductDetails() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Order class
class Order {
    private int orderId;
    private ArrayList<Product> products;
    private double totalAmount;

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    // Create a method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    // Create a method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product product : products) {
            product.displayProductDetails();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

// Customer class
class Customer {
    private String name;
    private int customerId;
    private ArrayList<Order> orders;

    // Constructor
    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Create a method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Create a method to display customer details and orders
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name + ", ID: " + customerId);
        System.out.println("Orders placed:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Main class to demonstrate the e-commerce platform
public class EcommercePlatform {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Smartphone", 700.0);
        Product product3 = new Product("Headphones", 150.0);

        // Creating customers
        Customer customer1 = new Customer("Alice", 101);
        Customer customer2 = new Customer("Bob", 102);

        // Creating orders
        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2);
        order2.addProduct(product3);

        // Customers place orders
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Displaying details
        customer1.displayCustomerDetails();
        customer2.displayCustomerDetails();
    }
}
