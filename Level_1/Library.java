class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            System.out.println("Book borrowed successfully: " + title);
            available = false;
        } else {
            System.out.println("Sorry, the book is not available: " + title);
        }
    }
     // Method to display details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}




public class Library {
    public static void main(String[] args) {
    LibraryBook book1 = new LibraryBook("C++ Basics", "Jane Smith", 19.99, true);
        book1.displayDetails();
        book1.borrowBook();
        book1.borrowBook();
    }   
}
