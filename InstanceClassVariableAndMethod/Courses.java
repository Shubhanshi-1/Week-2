class Course {
  
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "ABC Institute";

    // Constructor to initialize a course
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    
}


public class Courses {
    // Main method to test Course class
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 300.00);
        Course c2 = new Course("Web Development", 10, 400.00);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
