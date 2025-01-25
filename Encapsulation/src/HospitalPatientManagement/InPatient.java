package HospitalPatientManagement;

// Subclass InPatient
class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int numberOfDays;
    private StringBuilder medicalHistory;

    public InPatient(String patientId, String name, int age, double dailyCharge, int numberOfDays) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.numberOfDays = numberOfDays;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return dailyCharge * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return medicalHistory.toString();
    }
}
