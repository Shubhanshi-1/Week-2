class Book {
    // Static variable shared across all books
    static String libraryName = "City Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final to ensure it cannot be changed

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Implement method to display book details
    public void displayDetails() {
        // Checking if the object is an instance of the Book class
        if (this instanceof Book) {
            System.out.println("Book Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Object is not a valid Book instance.");
        }
    }
}

    public class  LibraryManagementSystem{
    public static void main(String[] args) {
        // Displaying the library name
        Book.displayLibraryName();

        // Creating book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        // Displaying details of the books
        book1.displayDetails();
        book2.displayDetails();
    }
}
