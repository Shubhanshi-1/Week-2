package HybridInheritence.RestaurantManagemenet;

//Main class
class RestaurantSystem{
    public static void main(String args[]){
        //MEthod call
        Chef chef = new Chef("RAMU","101");
        chef.performDuties();
        Waiter waiter = new Waiter("CHOTU","123");
        waiter.performDuties();
    }
}
