class Book {
    String title;
	String auther;
	double price;
	
	
    // Constructor
    Book(String title, String auther, double price) {
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    // Method to display Book Information
    void displayBookInfo() {
        System.out.println("Book title: " + title + " auther: " + auther + " price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book("Atomic Habits", "James Clear", 1000);
        book.displayBookInfo();  // calling the method to display the book details
    }
}



