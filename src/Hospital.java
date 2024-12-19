// Hospital.java
import java.util.ArrayList;

public class Hospital {
    private String name;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    @Override
    public String toString() {
        return "Hospital [Name=" + name + ", Number of Patients=" + patients.size() + "]";
    }
}
