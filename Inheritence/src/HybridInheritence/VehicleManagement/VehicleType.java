package HybridInheritence.VehicleManagement;

//Parent class
class VehicleType{
    double maxSpeed;
    String model;

    VehicleType(double maxSpeed, String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    // Method to display the details
    void displayDetails(){
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("Model: "+model);
    }
}
