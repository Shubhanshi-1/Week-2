class Vehicle {
    // Static variable shared across all vehicles
    static double registrationFee = 5000.0; // Default registration fee

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Using final to ensure the registration number cannot be modified

    // Constructor  of vehicle class
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Implement method to display vehicle details
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Vehicle Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid object. Not an instance of Vehicle.");
        }
    }
}
   
   public class VehicleRegistrationSystem{
    public static void main(String[] args) {
        // Displaying the default registration fee
        System.out.println("Default Registration Fee: $" + Vehicle.registrationFee);

        // Updating the registration fee
        Vehicle.updateRegistrationFee(6000.0);

        // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "REG123");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "REG456");
        Vehicle vehicle3 = new Vehicle("Charlie", "Truck", "REG789");

        // Displaying vehicle details
        vehicle1.displayDetails();
        vehicle2.displayDetails();
        vehicle3.displayDetails();
    }
}
