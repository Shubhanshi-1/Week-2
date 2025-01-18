class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor of book class
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Using getter for author
    public String getAuthor() {
        return author;
    }

    // Using setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass to demonstrate access to public and protected members
class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("Author: " + getAuthor()); // Accessing private member through getter
    }

    
}

public class BookLibrarySystem {
	// Main method
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Programming", "John Doe");
        ebook.displayDetails();
    }
}
