//Importing arraylist from util package
import java.util.ArrayList;

// Book class
class Book {
    private String title;
    private String author;

    // Constructor to initialize class values
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Implement method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class
class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Implement method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Implement method to display library details
    public void displayLibraryDetails() {
        System.out.println("Library: " + name);
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}

// Main class 
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating some books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Creating libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        // Displaying library details
        library1.displayLibraryDetails();
        library2.displayLibraryDetails();
    }
}
