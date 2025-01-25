package ECommercePlatform;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId,String name,double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

        // Getter and Setter methods
        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Abstract method to calculate discount
        public abstract double calculateDiscount();

        // Display product details
        public void displayDetails() {
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
        }
    }

