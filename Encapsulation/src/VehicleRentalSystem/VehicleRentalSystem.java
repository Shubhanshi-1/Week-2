package VehicleRentalSystem;

public class VehicleRentalSystem {
    public static void main(String args[]){
        Vehicle car = new Car("C123","Car",500,"INS123");
        Vehicle bike= new Bike("B123","Bike",400,"INS321");
        Vehicle truck= new Truck("T123","Truck",200,"INS432");

        Vehicle[] vehicles= {car,bike,truck};

        for(Vehicle vehicle: vehicles) {
            vehicle.displayDetails();
           System.out.println("Rental cost for 5 days: "+vehicle.calculateRentalCost(5));
           if(vehicle instanceof Insurable){
               Insurable insurable= (Insurable) vehicle;
               System.out.println("Insurance Cost: "+insurable.calculateInsurance());
               System.out.println("Insurance Details: "+insurable.getInsuranceDetails());

           }
           System.out.println();
        }
    }
}
