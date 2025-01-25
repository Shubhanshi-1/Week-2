package AssistedProblems.EmployeeManagementSystem;

class Developer extends Employee{
    String programmingLanguage ;

    Developer(String name,String id,int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    void displayDetails(){
        System.out.println("Employee type: Developer");
        super.displayDetails();
        System.out.println("Programming Language is: "+programmingLanguage);
    }
}