package HybridInheritence.RestaurantManagemenet;

//Child cass
class Chef extends People implements Worker{

    Chef(String name,String id){
        super(name,id);
    }
    // Method to display duties
    public void performDuties(){
        System.out.println("People type: Chef");
        super.displayDetails();
        System.out.println("Duties: Cooking, Guiding staff, Delivery of quality food");
    }
}