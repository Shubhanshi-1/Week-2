package VehicleRentalSystem;

//Abstract class Vehicle
abstract class Vehicle {
    String vehicleNumber;
    String vehicleType;
    double rentalRate;

     //Constructor of vehicle class
    public Vehicle(String vehicleNumber,String vehicleType,double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        this.rentalRate=rentalRate;
    }

    //Getter and Setter method

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate=rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Rental Rate: "+rentalRate);

    }

}
