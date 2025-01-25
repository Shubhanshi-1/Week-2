package HierarchicalInheritence.SchoolSystem;

// Child class
class Teacher extends Person{
    String subject;

    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    // Method to display roles
    void displayRole(){
        System.out.println("The role is: Teacher");
        super.displayDetail();
        System.out.println("Subject: "+subject);
    }
}
