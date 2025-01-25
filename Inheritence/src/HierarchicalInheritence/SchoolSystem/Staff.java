package HierarchicalInheritence.SchoolSystem;

//Child class
class Staff extends Person{
    String department;

    Staff(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    // Method to display roles
    void displayRole(){
        System.out.println("Role: Staff");
        super.displayDetail();
        System.out.println("Department is: "+department);
    }
}
