package MultilevelInheritence.OnlineOrderManagement;

class OrderManagement{
    public static void main(String args[]){
        DeliveredOrder order = new DeliveredOrder("OID1","22/03/2024","OID123","26/03/2024");
        order.getOrderStatus();
    }
}


