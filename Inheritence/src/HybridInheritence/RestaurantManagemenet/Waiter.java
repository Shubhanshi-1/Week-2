package HybridInheritence.RestaurantManagemenet;

// Child class
class Waiter extends People implements Worker{

    Waiter(String name,String id){
        super(name,id);
    }
    // Method to display Details
    public void performDuties(){
        System.out.println("People Type: Waiter");
        super.displayDetails();
        System.out.println("Duties: Serving,cleaning");
    }
}
