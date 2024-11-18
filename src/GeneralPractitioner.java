public class GeneralPractitioner extends HealthProfessional {
    private String specialty; 
    public GeneralPractitioner() {
        super();
    }
    public GeneralPractitioner(int ID, String name, String qualification, String specialty) {
        super(ID, name, qualification);
        this.specialty = specialty;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Specialty: " + specialty);
    }
}   
