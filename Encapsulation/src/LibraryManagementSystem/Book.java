package LibraryManagementSystem;

public class Book extends LibraryItem {
    private boolean isAvailable=true;
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getFine(int days) {
        return 50*days;
    }

    @Override
    public void reserveItem() {
        if(isAvailable){
            System.out.println("Book is reserved");
            isAvailable=false;
        }
        else System.out.println("Book is not Available");
    }

    @Override
    public void checkAvailability() {
        if(isAvailable) System.out.println("Book is available");
        else System.out.println("Book is not available");
    }
}
