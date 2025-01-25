package MultilevelInheritence.EducationalCourseHierarchy;

class EducationalCourse{
    public static void main(String args[]){
        PaidOnlineCourse course =new PaidOnlineCourse("Java","3 Month","YouTube",true,130000,30000.0);
        course.displayDetails();
    }
}


