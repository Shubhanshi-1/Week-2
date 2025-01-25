package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, String vehicleType, double rentalRate,String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber=insurancePolicyNumber;
    }

    @Override
    public double calculateInsurance() {
        return 0.02*getRentalRate() ;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number"+insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
}
