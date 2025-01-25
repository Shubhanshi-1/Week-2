package MultilevelInheritence.EducationalCourseHierarchy;

//Parent class
class Course{
    String courseName;
    String courseDuration;

    Course(String courseName, String courseDuration){
        this.courseName= courseName;
        this.courseDuration=courseDuration;
    }
    // Method to display basic details
    void displayDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Duration: "+courseDuration);
    }
}
