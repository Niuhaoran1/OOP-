import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // 第 3 部 分 - 使 用 类 和 对 象

        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practice", "City Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "Family Medicine", "Suburban Health Center");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Williams", "Internal Medicine", "Urban Medical Center");

        // 创建两个其他健康专业人员类型的对象
        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Lee", "Radiology", "General Hospital");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Chen", "Cardiology", "Regional Medical Center");

        // 打印所有卫生专业人员的详细信息
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        ohp1.printDetails();
        System.out.println("------------------------------");
        ohp2.printDetails();
        System.out.println("------------------------------");

        // 预约两次全科医生
        createAppointment("Alice", "1234567890", "Monday 10:00 AM", gp1);
        createAppointment("Bob", "0987654321", "Tuesday 11:00 AM", gp2);

        // 再预约另外两位其他类型的健康专业人士
        createAppointment("Charlie", "5555555555", "Wednesday 2:00 PM", ohp1);
        createAppointment("Diana", "4444444444", "Thursday 3:00 PM", ohp2);

        // 打印现有预约
        printExistingAppointments();

        // 取消现有的预约之一
        cancelBooking("1234567890");

        // 再次打印现有预约，以展示更新后的预约集合
        printExistingAppointments();
    }

    // 创建新的预约并将其添加到ArrayList中
    public static void createAppointment(String patientName, String patientPhoneNumber, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        if (patientName == null || patientPhoneNumber == null || preferredTimeSlot == null || selectedDoctor == null) {
            System.out.println("无法创建预约，缺少必要的信息。");
            return;
        }
        Appointment appointment = new Appointment(patientName, patientPhoneNumber, preferredTimeSlot, selectedDoctor);
        appointments.add(appointment);
        System.out.println("预约创建成功！");
    }

    // 显示ArrayList中现有的预约
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("没有现有的预约。");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // 使用患者的手机取消预约
    public static void cancelBooking(String patientPhoneNumber) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (appointment.patientPhoneNumber.equals(patientPhoneNumber)) {
                appointments.remove(i);
                System.out.println("预约已取消。");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("未找到使用该手机号的预约。");
        }
    }
}
