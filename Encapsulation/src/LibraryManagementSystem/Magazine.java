package LibraryManagementSystem;

public class Magazine extends LibraryItem{
    private boolean isAvailable=true;
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getFine(int days) {
        return 30*days;
    }

    @Override
    public void reserveItem() {
        if(isAvailable){
            System.out.println("Magazine is reserved");
            isAvailable=false;
        }
        else System.out.println("Magazine is not Available");

    }

    @Override
    public void checkAvailability() {
        if(isAvailable) System.out.println("Magazine is available");
        else System.out.println("Magazine is not available");
    }
}
