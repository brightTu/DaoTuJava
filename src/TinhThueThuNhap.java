import java.util.Scanner;

public class TinhThueThuNhap {

    public static final double GIAM_TRU_BAN_THAN = 4.0;
    public static final double GIAM_TRU_MOI_NGUOI = 1.6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên người nộp thuế:");
        String ten = sc.nextLine();

        System.out.println("Nhập vào tổng thu nhập trong năm đơn vị triệu đồng");
        double tongThuNhap = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập vào số người phụ thuộc:");
        int soNguoiPhuThuoc = Integer.parseInt(sc.nextLine());

        double thuNhapChiuThue = tongThuNhap
                - GIAM_TRU_BAN_THAN
                - soNguoiPhuThuoc * GIAM_TRU_MOI_NGUOI;

        double thueSuat = 0.0;
        if (thuNhapChiuThue <= 60) {
            thueSuat = 0.05;
        } else if (thuNhapChiuThue <= 120) {
            thueSuat = 0.10;
        } else if (thuNhapChiuThue <= 210) {
            thueSuat = 0.15;
        } else if (thuNhapChiuThue <= 384) {
            thueSuat = 0.20;
        } else if (thuNhapChiuThue <= 624) {
            thueSuat = 0.25;
        } else if (thuNhapChiuThue <= 960) {
            thueSuat = 0.30;
        } else {
            thueSuat = 0.35;
        }

        double soThue = thuNhapChiuThue * thueSuat;

        System.out.printf("%.0f%n", tongThuNhap);
        System.out.println(soNguoiPhuThuoc);
        System.out.printf("%.1f%n", thueSuat * 100);
        System.out.printf("Số thuế %s phải nộp là %.9f triệu đồng%n", ten, soThue);

        sc.close();
    }
}
