public class DemoGoiHam {
    public static int tinhTong(int a, int b) {
        int tong = a + b;
        return tong;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int kQua = tinhTong(x, y);
        System.out.println("Ket quả là: " + kQua);
    }
}