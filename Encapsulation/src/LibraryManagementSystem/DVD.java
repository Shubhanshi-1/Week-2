package LibraryManagementSystem;

public class DVD extends LibraryItem{
    private boolean isAvailable=true;
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getFine(int days) {
        return 50*days;
    }

    @Override
    public void reserveItem() {
        if(isAvailable){
            System.out.println("DVD is reserved");
            isAvailable=false;
        }
        else System.out.println("DVD is not Available");
    }

    @Override
    public void checkAvailability() {
     if(isAvailable) System.out.println("DVD is available");
     else System.out.println("DVD is not available");
    }
}
