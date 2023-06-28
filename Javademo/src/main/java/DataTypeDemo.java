import java.time.LocalDate;
import  java.time.LocalDateTime;
public class DataTypeDemo {
    // DATA TYPE: Kiểu dữ liệu

    public static void main(String[] args) {
        // Cú pháp khai báo biến
        //< Kiểu dữ liệu> <Tên biến> [= <Giá trị khởi tạo>]

        // PRIMITIVE:  Kiểu dữ liệu nguyên thủy

        // 1. INTEGER: Kiểu số nguyên
        // Bype (1), short (2),  int (3), long (8)

        int age = 18;
        System.out.println("age = " + age);

        // 2.  FLOAT POINT: Kiểu số thực
        // float (4), double(8)
        // Giá trị mặc định: 0.0
        double score = 9.5;
        System.out.println("score = " + score);

        // 3. BOOLEAN: Kiểu Logic
        // boolean (1 bít)
        // Giá trị mặc định: false
        boolean hasMoney = true;
        System.out.println("hasMoney = " + hasMoney);

        // 4. CHARACTER: Kiểu ký tự
        // char (2)
        // Giá trị mặc định: \u0000
        char c = 'A';
        System.out.println("c = " + c);

        // 5. String: Kiểu xâu kí tự
        // Giá trị mặc định: null
        String fullname = "Đỗ Cao Khang";
        System.out.println("fullname = " + fullname);

        // 6. OBJECT: Kiêu đối tượng
        // Giá trị mặc định: null

        // 7. DATETIME: thời gian
        // localdate, localtime, localdatetime

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // 8. Kiểu enum: Tập hợp hữu hạn các giá trị
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        // 9. ARRAY: Kiểu mảng
        String[] fruits = {"Táo", "Cam", "Dưa hấu"};
        int[] numbers = new int[]{1, 2, 3, 4, 5};;
        System.out.println("fruits[0] = " + fruits[0]);






    }
}