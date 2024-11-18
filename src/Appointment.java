public class Appointment {
    private String patientName;
    String patientPhoneNumber;

    private String preferredTimeSlot;

    private HealthProfessional selectedDoctor;

    public Appointment() {
    }

    public Appointment(String patientName, String patientPhoneNumber, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhoneNumber = patientPhoneNumber;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone Number: " + patientPhoneNumber);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor: ");
        if (selectedDoctor != null) {
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected.");
        }
    }
}