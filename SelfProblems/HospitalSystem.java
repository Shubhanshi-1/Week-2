import java.util.ArrayList;

// Patient class
class Patient {
    private String name;
    private int patientId;
    private ArrayList<Doctor> doctors;

    // Constructor of patient class
    public Patient(String name, int patientId) {
        this.name = name;
        this.patientId = patientId;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Create a method to add a doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Create a method to display consulted doctors
    public void displayConsultedDoctors() {
        System.out.println("Patient: " + name + " has consulted the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    // Constructor of doctor class
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Create a method to add a patient
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional association
        }
    }

    // Create a method to consult a patient
    public void consult(Patient patient) {
        addPatient(patient);
        System.out.println("Doctor " + name + " (Specialization: " + specialization + ") is consulting Patient " + patient.getName());
    }

    // Create a method to display consulted patients
    public void displayConsultedPatients() {
        System.out.println("Doctor: " + name + " has consulted the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Hospital class
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor of hospital class
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Create a method to add a doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Create a method to add a patient
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Create a method to display hospital details
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName() + " (" + doctor.specialization + ")");
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Main class to demonstrate association and communication
public class HospitalSystem {
    public static void main(String[] args) {
        // Creating a hospital
        Hospital hospital = new Hospital("City Care Hospital");

        // Creating doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Neurology");

        // Creating patients
        Patient patient1 = new Patient("Alice", 101);
        Patient patient2 = new Patient("Bob", 102);

        // Adding doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Performing consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor2.consult(patient2);

        // Displaying hospital details
        hospital.displayHospitalDetails();

        // Displaying consulted patients and doctors
        doctor1.displayConsultedPatients();
        doctor2.displayConsultedPatients();
        patient1.displayConsultedDoctors();
        patient2.displayConsultedDoctors();
    }
}
