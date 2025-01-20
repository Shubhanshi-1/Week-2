class Employee {
    // Static variable shared across all employees
    static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id; // Using final keyword to ensure id cannot be modified
    private String designation;

    // Constructor of a Employee class
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employees, whenever a new employee is created
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Implement method to display employee details
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("Invalid object. Not an instance of Employee.");
        }
    }
}  
	public class EmployeeManagementSystem{
    public static void main(String[] args) {
        // Displaying the company name
        System.out.println("Company Name: " + Employee.companyName);

        // Creating employee instances
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Data Analyst");
        Employee emp3 = new Employee("Charlie", 103, "Product Manager");

        // Displaying total employees
        Employee.displayTotalEmployees();

        // Displaying employee details
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
