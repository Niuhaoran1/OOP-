public class OtherHealthProfessional extends HealthProfessional {
    private String role; 
    public OtherHealthProfessional() {
        super();
    }
    public OtherHealthProfessional(int ID, String name, String qualification, String role) {
        super(ID, name, qualification);
        this.role = role;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Other Health Professional");
        System.out.println("Role: " + role);
    }           
}  
    

