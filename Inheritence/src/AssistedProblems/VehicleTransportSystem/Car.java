package AssistedProblems.VehicleTransportSystem;

class Car extends Vehicle{

    int seatCapacity;

    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity= seatCapacity;
    }

    void displayInfo(){
        System.out.println("Vehicle Type: Car");
        super.displayInfo();
        System.out.println("Seat capacity is: "+seatCapacity);
    }
}
