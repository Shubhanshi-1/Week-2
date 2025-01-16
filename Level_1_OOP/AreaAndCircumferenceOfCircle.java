 class Circle{
     
	double radius;
	  
	  //Constructor 
	   public Circle(double radius){
		   this.radius=radius;
	   }
	   // Method to Calculate and display area of a circle
	    void displayArea(){
		    double area = Math.PI*radius*radius;
		   System.out.println("Area of circle is: "+area);
	 }	 
        // Methos to Calculate and Display circumference of a circle
        void displayCircumference(){
             double circumference= 2*Math.PI*radius;
          System.out.println("The circumference of a circle is: "+circumference);
         }		  
}
//Main method
	   public class AreaAndCircumferenceOfCircle{
	   public static void main(String args[]){
		   //Create an object for Circle class
		    Circle circle = new Circle(5);
          
             circle.displayArea();// Calling the method to display the area
			 circle.displayCircumference();//Calling the method to display circumference
		}
	   }
	   
	   
	

           		  
	 