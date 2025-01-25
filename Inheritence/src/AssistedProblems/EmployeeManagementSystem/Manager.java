package AssistedProblems.EmployeeManagementSystem;

class Manager extends Employee{
    int teamSize;

    Manager(String name,String id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    void displayDetails(){
        System.out.println("Employee type: Manager");
        super.displayDetails();
        System.out.println("Team Size is: "+teamSize);
    }

}
