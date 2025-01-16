import java.util.*;
class Student {
     String name;
	String rollnumber;
	 double marks;
	
	
    // Constructor
     public Student(String name, String rollnumber, double marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
     // Method to calculate grade 
	  char calculategrade(double marks){
		  char grades;
		  if(marks>=80) {
			  grades = 'A';
		  }
		  else if(marks>=70){
			  grades= 'B';
		  }
		  else if(marks>=60){
			  grades = 'C';
		  }
		  else if(marks>=50){
			  grades ='D';
		  }
		  else if(marks>=40){
			  grades ='E';
		  }
		  else {
			  grades = 'R';
		  }
		  return grades;
	    }
			  
		  

    // Method to display Student Details
    void displayStudentDetails( char grades) {
        System.out.println("Name: " + name + " Roll number: " + rollnumber + " grades " + grades);
    }
	
}

public class StudentDetails {
    public static void main(String[] args) {
		Student student = new Student("Shubhanshi Verma", "0111AS211054", 89);
	     char grades = student.calculategrade(89);
		
        
        student.displayStudentDetails(grades);  // calling the method to display the student details
		
    }
}



