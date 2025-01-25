package MultilevelInheritence.OnlineOrderManagement;

class DeliveredOrder extends ShippedOrder{

    String deliveryDate;

    DeliveredOrder(String orderId,String orderDate,String trackingNumber, String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    void getOrderStatus(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Order Date: "+orderDate);
        System.out.println("Tracking Number: "+trackingNumber);
        System.out.println("Delivery Date "+deliveryDate);
    }
}
