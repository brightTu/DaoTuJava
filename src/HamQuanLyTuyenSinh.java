import java.util.Scanner;

public class HamQuanLyTuyenSinh {

    public static final double KV_A = 2.0;
    public static final double KV_B = 1.0;
    public static final double KV_C = 0.5;
    public static final double KV_X = 0.0;

    public static final double DT_1 = 2.5;
    public static final double DT_2 = 1.5;
    public static final double DT_3 = 1.0;
    public static final double DT_0 = 0.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập điểm môn thứ nhất");
        double mon1 = Double.parseDouble(sc.nextLine());

        System.out.println("Mời bạn nhập điểm môn thứ hai");
        double mon2 = Double.parseDouble(sc.nextLine());

        System.out.println("Mời bạn nhập điểm môn thứ ba");
        double mon3 = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập khu vực của thí sinh:");
        System.out.println("A. Khu Vực A");
        System.out.println("B. Khu Vực B");
        System.out.println("C. Khu Vực C");
        System.out.println("X. Không có khu vực");
        String kv = sc.nextLine().trim().toUpperCase();
        double diemKV = tinhDiemKhuVuc(kv);

        System.out.println("Nhập đối tượng của thí sinh:");
        System.out.println("1. Đối tượng 1");
        System.out.println("2. Đối tượng 2");
        System.out.println("3. Đối tượng 3");
        System.out.println("0. Không có đối tượng");
        int dt = Integer.parseInt(sc.nextLine());
        double diemDT = tinhDiemDoiTuong(dt);

        System.out.println("Mời bạn nhập điểm chuẩn");
        double diemChuan = Double.parseDouble(sc.nextLine());
        double tong = mon1 + mon2 + mon3 + diemKV + diemDT;

        System.out.printf("Bạn đã đạt với số điểm: %.1f%n", tong);

        // Kiểm tra điều kiện trượt vì môn 0 điểm
        if (mon1 == 0 || mon2 == 0 || mon3 == 0) {
            System.out.println("Thí sinh bị rớt vì có môn điểm 0.");
        } else if (tong >= diemChuan) {
            System.out.println("Thí sinh TRÚNG TUYỂN.");
        } else {
            System.out.println("Thí sinh rớt.");
        }

        sc.close();
    }

    // Hàm tính điểm khu vực
    public static double tinhDiemKhuVuc(String kv) {
        switch (kv) {
            case "A":
                return KV_A;
            case "B":
                return KV_B;
            case "C":
                return KV_C;
            case "X":
                return KV_X;
        }
        System.out.println("Lựa chọn không hợp lệ, tính như không ưu tiên khu vực.");
        return KV_X;
    }

    // Hàm tính điểm đối tượng
    public static double tinhDiemDoiTuong(int dt) {
        if (dt == 1) {
            return DT_1;
        } else if (dt == 2) {
            return DT_2;
        } else if (dt == 3) {
            return DT_3;
        } else if (dt == 0) {
            return DT_0;
        }
        System.out.println("Lựa chọn không hợp lệ, tính như không ưu tiên đối tượng.");
        return DT_0;
    }
}