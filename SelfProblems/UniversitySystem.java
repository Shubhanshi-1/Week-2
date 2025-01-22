import java.util.ArrayList;

// Faculty class
class Faculty {
    private String name;
    private String specialization;

    // Constructor of faculty class
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Create a method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name + ", Specialization: " + specialization);
    }
}

// Department class
class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyMembers;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Create a method to add a faculty member
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Create a method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFacultyDetails();
        }
    }
}

// University class
class University {
    private String universityName;
    private ArrayList<Department> departments;

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Create a method to add a department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Create a method to display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Create a method to delete the university
    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear(); // Composition: Removing the university deletes all departments
        System.out.println("All departments have been deleted.");
    }
}

// Main class to demonstrate composition and aggregation
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating a university
        University university = new University("Tech University");

        // Creating departments
        Department csDept = new Department("Computer Science");
        Department mechDept = new Department("Mechanical Engineering");

        // Creating faculty members
        Faculty faculty1 = new Faculty("Dr. Alice", "Artificial Intelligence");
        Faculty faculty2 = new Faculty("Dr. Bob", "Machine Learning");
        Faculty faculty3 = new Faculty("Dr. Charlie", "Thermodynamics");

        // Adding faculty members to departments
        csDept.addFaculty(faculty1);
        csDept.addFaculty(faculty2);
        mechDept.addFaculty(faculty3);

        // Adding departments to the university
        university.addDepartment(csDept);
        university.addDepartment(mechDept);

        // Displaying university details
        university.displayUniversityDetails();

        // Demonstrating faculty independent of a department
        Faculty faculty4 = new Faculty("Dr. Eve", "Quantum Physics");
        System.out.println("\nIndependent Faculty:");
        faculty4.displayFacultyDetails();

        // Deleting the university
        university.deleteUniversity();
    }
}
