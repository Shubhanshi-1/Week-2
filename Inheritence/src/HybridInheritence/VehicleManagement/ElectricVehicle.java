package HybridInheritence.VehicleManagement;

// Child class ElectricVehicle inheriting parent class vehicle
class ElectricVehicle extends VehicleType{
    String batteryStatus;

    ElectricVehicle(double maxSpeed, String model,String batteryStatus){
        super(maxSpeed,model);
        this.batteryStatus=batteryStatus;
    }
    // Method charge
    void charge(){
        System.out.println("Vehicle Type: Electric Vehicle");
        super.displayDetails(); //calling the parent class method
        System.out.println("Battery Status: "+batteryStatus);
    }
}
