 class EmployeeDetails{
     
	 String name;
	 int id;
	 double salary;
	  
	  //Constructor 
	   public EmployeeDetails(String name, int id, double salary){
		   this.name= name;
		   this.id=id;
		   this.salary= salary;
	   }
	   // Method to display the details of the Employee
	 void displayDetails(){
		   System.out.println("Name of Employee: "+name+" Id of Employee: "+id+"Salary of employee is: "+salary);
	 }	   
}
//Main method
	   public class Employee{
	   public static void main(String args[]){
		   //Create an object for EmployeeDetails class
		    EmployeeDetails employee = new EmployeeDetails("Shubhanshi Verma", 101, 10000000);
          
             employee.displayDetails();// Calling the method to display the details
		}
	   }
	   
	   
	

           		  
	 