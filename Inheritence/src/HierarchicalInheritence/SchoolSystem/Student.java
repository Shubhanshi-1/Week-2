package HierarchicalInheritence.SchoolSystem;

// Child class
class Student extends Person{
    char grade;

    Student(String name,int age,char grade){
        super(name,age);
        this.grade=grade;
    }
    //Method to display roles
    void displayRole(){
        System.out.println("The role is: Student");
        super.displayDetail();
        System.out.println("Grade: "+grade);
    }
}
