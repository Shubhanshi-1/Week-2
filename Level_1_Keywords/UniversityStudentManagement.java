class Student {
    // Static variable shared across all students
    static String universityName = "Global University";
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private final int rollNumber; // Using final keyword to ensure rollnumber cannot be modified
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Incrementing total students count
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Implement method to update the grade of the student
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for student " + name + " to: " + grade);
        } else {
            System.out.println("Invalid object. Not an instance of Student.");
        }
    }

    // Implement method to display student details
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid object. Not an instance of Student.");
        }
    }
 }
   public class UniversityStudentManagement{
    public static void main(String[] args) {

        // Creating student instances
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");
        Student student3 = new Student("Charlie", 103, "A");

        // Displaying total students
        Student.displayTotalStudents();

        // Displaying student details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

        // Updating grades
        student2.updateGrade("A+");
        student2.displayDetails();
    }
}
