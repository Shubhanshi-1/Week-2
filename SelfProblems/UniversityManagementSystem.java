import java.util.ArrayList;

// Course class
class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    // Constructor of course class
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Create a method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Create a method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Ensure bidirectional association
        }
    }

    // Create a method to display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Professor class
class Professor {
    private String name;
    private ArrayList<Course> courses;

    // Constructor of proffesor class
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Create a method to add a course
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this); // Ensure bidirectional association
        }
    }

    // Create a method to display courses taught by the professor
    public void displayCourses() {
        System.out.println("Professor: " + name + " teaches the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.courseName);
        }
    }
}

// Student class
class Student {
    private String name;
    private int studentId;
    private ArrayList<Course> courses;

    // Constructor of student class
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Create a method to add a course
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Method to display courses enrolled by the student
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.courseName);
        }
    }
}

// Main class to demonstrate the university management system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Creating professors
        Professor professor1 = new Professor("Dr. Alice");
        Professor professor2 = new Professor("Dr. Bob");

        // Assigning professors to courses
        professor1.addCourse(course1);
        professor2.addCourse(course2);

        // Creating students
        Student student1 = new Student("John", 101);
        Student student2 = new Student("Jane", 102);

        // Enrolling students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student2);

        // Displaying details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        professor1.displayCourses();
        professor2.displayCourses();
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
    }
}
