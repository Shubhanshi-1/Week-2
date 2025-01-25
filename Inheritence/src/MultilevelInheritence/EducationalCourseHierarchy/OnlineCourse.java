package MultilevelInheritence.EducationalCourseHierarchy;

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, String courseDuration, String platform,boolean isRecorded){
        super(courseName,courseDuration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    //Method to display details
    void displayDetails(){
        super.displayDetails(); // calling method of parent class
        System.out.println("Platform: "+platform);
        System.out.println("isRecorded: "+isRecorded);
    }
}