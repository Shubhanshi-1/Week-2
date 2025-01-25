package AssistedProblems.EmployeeManagementSystem;

class Employee{
    String name;
    String id;
    int salary;

    Employee(String name, String id,int salary){
        this.name= name;
        this.id =id;
        this.salary =salary;
    }
    void displayDetails(){
        System.out.println("Name of Employee is: "+name);
        System.out.println("Id of employee is: "+id);
        System.out.println("Salary: "+salary);
    }
}
