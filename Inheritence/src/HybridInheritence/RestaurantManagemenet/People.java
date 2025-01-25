package HybridInheritence.RestaurantManagemenet;

// PArent class
class People{
    String name;
    String id;

    People(String name, String id){
        this.name= name;
        this.id=id;
    }
    // Method to display Details
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
