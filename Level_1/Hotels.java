class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor of hotel booking class
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor of hotel booking class
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor of hotel booking class
    public HotelBooking(HotelBooking another) {
        this.guestName = another.guestName;
        this.roomType = another.roomType;
        this.nights = another.nights;
    }
     // Mehtod to display Booking Details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}


public class Hotels {
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking paramBooking = new HotelBooking("Bob", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        defaultBooking.displayBookingDetails();
        paramBooking.displayBookingDetails();
        copyBooking.displayBookingDetails();
    }
}
