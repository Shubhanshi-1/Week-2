package RideHaillingApplication;

// Main class to demonstrate functionality
public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("V001", "John Doe", 15, "Downtown");
        Vehicle bike = new Bike("V002", "Jane Smith", 10, "Uptown");
        Vehicle auto = new Auto("V003", "Sam Wilson", 8, "Suburb");

        Vehicle[] vehicles = {car, bike, auto};

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println();
        }
    }
}
