package SingleInheritence.LibraryManagentSystem;

class Author extends Book{
    String name;
    String bio;

    Author(String title,int publicationyear,String name,String bio){
        super(title,publicationyear);
        this.name= name;
        this.bio= bio;
    }

    void displayInfo(){
        System.out.println("Title of Book: "+title);
        System.out.println("Publication year: "+publicationyear);
        System.out.println("Name of Author: "+name);
        System.out.println("BIO: "+bio);
    }

}
