package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    public Car(String vehicleNumber, String vehicleType, double rentalRate,String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber= insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate();
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: "+insurancePolicyNumber;
    }
}
