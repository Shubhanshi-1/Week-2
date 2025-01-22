import java.util.ArrayList;

// Employee class
class Employee {
    private String name;
    private int employeeId;

    // Constructor of employee class
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Implement method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

// Department class
class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor of department class
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Create a method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Create a method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}

// Company class
class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Create a method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Create a method to display company details
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Create a method to delete the company
    public void deleteCompany() {
        System.out.println("Deleting Company: " + companyName);
        departments.clear(); // Clearing departments also removes employees as part of composition
        System.out.println("All departments and employees have been deleted.");
    }
}

// Main class to demonstrate composition relationship
public class CompanySystem {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Create departments
        Department dept1 = new Department("Engineering");
        Department dept2 = new Department("Marketing");

        // Create employees
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        // Adding employees to departments
        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);
        dept2.addEmployee(emp3);

        // Adding departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Displaying company details
        company.displayCompanyDetails();

        // Deleting the company
        company.deleteCompany();
    }
}
