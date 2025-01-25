package OnlineFoodDelivery;

public class OnlineFoodDelivery {
    public static void main(String args[]){
        FoodItem vegItem = new VegItem("Paneer Tikka", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);

        vegItem.getItemDetails();
        System.out.println("Total price: "+vegItem.calculateTotalprice());
        System.out.println("Discount Applied: "+vegItem.applyDiscount());
        System.out.println(vegItem.getDiscountDetails());

        nonVegItem.getItemDetails();
        System.out.println("Total price: "+nonVegItem.calculateTotalprice());
        System.out.println("Discount Applied: "+nonVegItem.applyDiscount());
        System.out.println(nonVegItem.getDiscountDetails());

    }
}
