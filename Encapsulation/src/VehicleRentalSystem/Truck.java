package VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    public Truck(String vehicleNumber, String vehicleType, double rentalRate,String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber=insurancePolicyNumber;
    }

    @Override
    public double calculateInsurance() {
        return 0.1*getRentalRate() ;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance policy number: "+insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days+100;
    }
}
