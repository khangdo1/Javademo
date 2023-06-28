import java.time.LocalDate;
public class Program {
    public static void main(String[] args) {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        // In dữ liệu
        System.out.println("Định danh phòng ban: " + departmentA.id) ;
        System.out.println("Tên phòng ban: " + departmentA.name);

        Position positionA = new position();
        positionA.id = 1;
        positionA.name = PositionName.DEV;
        System.out.println("Định danh chức vụ: " + positionA.id);
        System.out.println(" Tên chức vụ: " + positionA.name);

        Account accountA = new account();
        accountA.id = 1;
        accountA.email = "khangsjc@gmail.com";
        accountA.username ="Khang";
        accountA.fullName = "Đỗ Cao Khang";
        accountA.department = departmentA;
        accountA.position = positionA;
        accountA.createDate = LocalDate.now();

        System.out.println("Định danh nhân viên: " + accountA.id);
        System.out.println("Email nhân viên: " + accountA.email);
        System.out.println("Username nhân viên: " + accountA.username);
        System.out.println("Họ tên nhân viên: " + accountA.fullName);
        System.out.println("Tên chức vụ nhân viên: " + accountA.position.name);
        System.out.println("Ngày tạo nhân viên: " + accountA.createDate);

    }
}
