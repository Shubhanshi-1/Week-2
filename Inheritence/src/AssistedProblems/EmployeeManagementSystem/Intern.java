package AssistedProblems.EmployeeManagementSystem;

class Intern extends Employee{
    String department;
    Intern(String name, String id, int salary,String department){
        super(name,id,salary);
        this.department=department;
    }
    void displayDetails(){
        System.out.println("Employee type: Intern");
        super.displayDetails();

        System.out.println("Department: "+department);
    }
}


