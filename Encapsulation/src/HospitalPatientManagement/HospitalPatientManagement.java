package HospitalPatientManagement;

// Main class to demonstrate functionality
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John Doe", 45, 2000, 5);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 30, 500);

        // Add medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery");
        ((MedicalRecord) inPatient).addRecord("Post-surgery recovery");
        ((MedicalRecord) outPatient).addRecord("Consulted for flu symptoms");

        // Process patients
        Patient[] patients = {inPatient, outPatient};

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                System.out.println("Medical Records: \n" + ((MedicalRecord) patient).viewRecords());
            }
            System.out.println();
        }
    }
}
