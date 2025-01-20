class Patient {
    // Static variable shared across all patients
    static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final String patientID; // Using final keyword to ensure that the patient id is unique and immutable
    // Constructor of patient class
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Incrementing total patient count
    }

    // Static method to get total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Implement method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid object. Not an instance of Patient.");
        }
    }
 }
   public class HospitalManagementSystem{
    public static void main(String[] args) {
        // Displaying hospital name
       // System.out.println("Welcome to " + hospitalName);

        // Creating patient instances
        Patient patient1 = new Patient("Alice", 30, "Fever", "P001");
        Patient patient2 = new Patient("Bob", 45, "Diabetes", "P002");
        Patient patient3 = new Patient("Charlie", 28, "Flu", "P003");

        // Displaying total patients
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());

        // Displaying details of each patient
        patient1.displayDetails();
        patient2.displayDetails();
        patient3.displayDetails();
    }
}
