public class HealthProfessional {
    private int ID;
    private String name;
    private String qualification; 
    public HealthProfessional() {
    }
    public HealthProfessional(int ID, String name, String qualification) {
        this.ID = ID;
        this.name = name;
        this.qualification = qualification;
    }
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
    }              
}