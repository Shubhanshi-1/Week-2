class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor of the movie ticket class
    MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.seatNumber = -1; // Default seat number (not assigned)
        this.isBooked = false; // Ticket initially not booked
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber) {
        if (isBooked) {
            System.out.println("This ticket has already been booked.");
        } else {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket successfully booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket booked yet for " + movieName);
        }
    }
}

public class MovieTicketC {
    public static void main(String[] args) {
        // Creating a new MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception", 12.50);

        //display ticket details before booking
        ticket.displayTicketDetails();

        // Book the ticket
        ticket.bookTicket(5);

        // Displaying ticket details after booking
        ticket.displayTicketDetails();

        // Attempting to book the ticket again
        ticket.bookTicket(10);
    }
}
