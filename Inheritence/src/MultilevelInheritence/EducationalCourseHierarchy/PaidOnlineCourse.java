package MultilevelInheritence.EducationalCourseHierarchy;

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, String courseDuration, String platform,boolean isRecorded,double fee,double discount){
        super(courseName,courseDuration,platform,isRecorded);
        this.fee =fee;
        this.discount=discount;
    }
    // Method to display details
    void displayDetails(){
        super.displayDetails(); // calling method of parent class
        System.out.println("fee: "+fee);
        System.out.println("discount: "+discount);
    }
}

