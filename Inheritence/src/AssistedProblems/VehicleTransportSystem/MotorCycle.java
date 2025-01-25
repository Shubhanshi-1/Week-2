package AssistedProblems.VehicleTransportSystem;

class MotorCycle extends Vehicle{
    double mileage ;

    MotorCycle(int maxSpeed,String fuelType, double mileage){
        super(maxSpeed,fuelType);
        this.mileage=mileage;
    }

    void displayInfo(){
        System.out.println("Vehicle Type: MotoCycle");
        super.displayInfo();
        System.out.println("Mileage: "+mileage);
    }
}
