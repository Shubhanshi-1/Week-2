package LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String args[]){
        LibraryItem book = new Book("B111","Rich Dad Poor Dad","Robert T. Kiyosaki");
        LibraryItem magazine = new Magazine("M121","Bhopal Times","Khushi V.");
        LibraryItem dvd = new DVD("DVD1","Harry Potter","J.K. rowling");

        book.checkAvailability();
        book.reserveItem();
        System.out.println("Fine for book: "+book.getFine(5));

        magazine.checkAvailability();
        magazine.reserveItem();
        System.out.println("Fine for Magazine is: "+magazine.getFine(8));

        dvd.checkAvailability();
        dvd.reserveItem();
        System.out.println("Fine for DVD is: "+dvd.getFine(4));


    }
}
