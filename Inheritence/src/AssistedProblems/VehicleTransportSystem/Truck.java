package AssistedProblems.VehicleTransportSystem;

class Truck extends Vehicle{
    int totalWheels;

    Truck(int maxSpeed,String fuelType, int totalWheels){
        super(maxSpeed,fuelType);
        this.totalWheels=totalWheels;
    }

    void displayInfo(){
        System.out.println("Vehicle type: Truck");
        super.displayInfo();
        System.out.println("Total number of wheels: "+totalWheels);
    }
}
