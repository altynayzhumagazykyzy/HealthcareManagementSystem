// MedicalProfessional.java
public class MedicalProfessional {
    private String name;
    private String specialization;

    public MedicalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "MedicalProfessional [Name=" + name + ", Specialization=" + specialization + "]";
    }
}
