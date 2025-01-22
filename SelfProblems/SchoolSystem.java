import java.util.ArrayList;

// Course class
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Constructor of course class
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Create a method to enroll a student
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Ensure bidirectional association
        }
    }

    // Create a method to display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;

    // Constructor of Student class
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Create a method to add a course (called from Course)
    public void addCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    // Create a method to display enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name + "'s Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.courseName);
        }
    }
}

// School class
class School {
    private String schoolName;
    private ArrayList<Student> students;

    // Constructor of school class
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Create a method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Create a method to display school details
    public void displaySchoolDetails() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class to demonstrate the relationships
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating a school
        School school = new School("Green Valley High");

        // Creating students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Creating courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enrolling students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        // Displaying school details
        school.displaySchoolDetails();

        // Displaying student details
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();

        // Displaying course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
