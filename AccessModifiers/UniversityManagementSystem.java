class Student {
    // Access modifiers
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor of the student class
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Using getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass to demonstrate protected member access
class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display details of student
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("CGPA: " + getCGPA()); // Accessing private member through getter
    }

   
}


public class UniversityManagementSystem {
	// Main method
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 3.8);
        pgStudent.displayDetails();
    }
}