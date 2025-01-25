package MultilevelInheritence.OnlineOrderManagement;

class ShippedOrder extends Order{
    String trackingNumber;

    ShippedOrder(String orderId,String orderDate,String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
}

