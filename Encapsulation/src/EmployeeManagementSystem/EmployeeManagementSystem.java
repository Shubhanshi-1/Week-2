package EmployeeManagementSystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee instances
        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000, 70000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 20000, 20, 500);
        pte.assignDepartment("Support");

        // Polymorphism: Using Employee reference
        Employee[] employees = {fte, pte};

        // Display employee details
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("----------------------------------");
        }
    }
}
