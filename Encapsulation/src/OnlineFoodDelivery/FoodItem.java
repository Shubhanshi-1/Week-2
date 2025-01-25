package OnlineFoodDelivery;

public abstract class FoodItem implements Discountable{
      String itemName;
      double  price;
      int quantity;

      FoodItem(String itemName,double  price,int quantity){
          this.itemName=itemName;
          this.price=price;
          this.quantity=quantity;
      }

      //Getter and Setter
      public String getItemName(){
          return itemName;
      }

    public void setItemName(String itemNAme){
        this.itemName=itemName;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setAuthor(int quantity){
        this.quantity=quantity;
    }

     // abstract method
    public abstract double calculateTotalprice();



      //concrete method
     public void getItemDetails(){
         System.out.println("Item name: "+itemName);
         System.out.println("Price: "+price);
         System.out.println("Quantity: "+quantity);
     }

}
