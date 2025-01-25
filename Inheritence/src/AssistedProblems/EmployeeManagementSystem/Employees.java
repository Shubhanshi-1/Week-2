package AssistedProblems.EmployeeManagementSystem;

class Employees{
    public static void main(String args[]){
        Manager manager = new Manager("Shubhanshi Verma","0111AS211054",1500000,8);
        manager.displayDetails();
        Intern intern = new Intern("Rashi Raj","111",15000,"NLP");
        intern.displayDetails();
        Developer developer = new Developer("Rishav Raj","291", 2000000,"java");
        developer.displayDetails();
    }
}