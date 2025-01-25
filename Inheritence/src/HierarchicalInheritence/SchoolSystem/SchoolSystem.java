package HierarchicalInheritence.SchoolSystem;

// Main class
class SchoolSystem{
    public static void main(String args[]){
        // Method call
        Teacher teacher= new Teacher("Mridula",28,"Chemistry");
        teacher.displayRole();
        Student stu = new Student("Shubhanshi",22,'A');
        stu.displayRole();
        Staff staff= new Staff("Ranveer",38,"Mechanical");
        staff.displayRole();
    }
}



