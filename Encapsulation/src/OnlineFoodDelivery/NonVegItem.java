package OnlineFoodDelivery;

public class NonVegItem extends FoodItem{
    private static final double ADDITIONAL_CHARGE =50.0 ;//Additional Charge
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalprice() {
        return (getPrice()+ADDITIONAL_CHARGE)*getQuantity();
    }

    @Override
    public double applyDiscount() {
      return 0.05* calculateTotalprice();  // 5% discount
    }

    @Override
    public String getDiscountDetails() {
       return "5% discount applied on Non-Veg Item";

    }
}
