package OnlineFoodDelivery;

public class VegItem extends FoodItem implements Discountable {

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalprice() {
        return getPrice()*getQuantity();
    }


    @Override
    public double applyDiscount() {
return 0.1*calculateTotalprice(); //!)% discount
    }

    @Override
    public String getDiscountDetails() {
         return "10% discount applied on veg items";
    }
}
