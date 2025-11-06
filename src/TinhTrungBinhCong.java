import java.util.Scanner;
public class TinhTrungBinhCong {
    public static void main(String[] args) {
        // Hằng số xác định số lượng số cần nhập
        final int SO_LUONG = 5;

        // Biến tích lũy tổng
        int tong = 0;

        // Tạo đối tượng Scanner
        Scanner Nhap = new Scanner(System.in);

        System.out.println("Nhập " + SO_LUONG + " số nguyên:");

        // Vòng lặp nhập và cộng dồn
        for (int i = 1; i <= SO_LUONG; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int so = Integer.parseInt(Nhap.nextLine());
            tong += so; // cộng dồn giá trị
        }

        // Tính trung bình (ép kiểu để tránh chia nguyên)
        double trungBinh = (double) tong / SO_LUONG;

        // Xuất kết quả
        System.out.println("Giá trị trung bình là: " + trungBinh);

        // Đóng Scanner
        Nhap.close();
    }
}
