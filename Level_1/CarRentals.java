class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost(double dailyRate) {
        return rentalDays * dailyRate;
    }
    // Method to display Rental details
    public void displayRentalDetails(double dailyRate) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost(dailyRate));
    }
}

public class CarRentals {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Charlie", "Sedan", 5);
        rental.displayRentalDetails(50.0);
    }
}