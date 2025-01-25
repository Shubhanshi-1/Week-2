package HybridInheritence.VehicleManagement;

//  Another child class inheriting Vehicle class and implementing refuelable
class PetrolVehicle extends VehicleType implements Refuelable{
    int wheel;

    PetrolVehicle(double maxSpeed, String model,int wheel){
        super(maxSpeed,model);
        this.wheel=wheel;
    }
    // Method refuel
    public void refuel(){
        System.out.println("Tank Full");
    }
    // Method to display Details
    void displayDetails(){
        System.out.println("Vehicle Type: Petrol Vehicle");
        super.displayDetails();
        System.out.println("Number of Wheels: "+wheel);
    }
}
