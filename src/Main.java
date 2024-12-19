// Main.java
public class Main {
    public static void main(String[] args) {
        // Create Patients
        Patient patient1 = new Patient(1, "Alice", 30);
        Patient patient2 = new Patient(2, "Bob", 45);

        // Create MedicalProfessional
        MedicalProfessional doctor = new MedicalProfessional("Dr. Smith", "Cardiology");

        // Create Hospital
        Hospital hospital = new Hospital("City Hospital");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Output details
        System.out.println(doctor);
        System.out.println(hospital);
        hospital.displayPatients();

        // Compare Patients
        System.out.println("Are patients same? " + (patient1.getId() == patient2.getId()));
    }
}
