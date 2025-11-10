import java.util.Scanner;

public class HamTimSoLonNhat {
    public static int findMax(int a, int b, int c) {
        int findMax = a;
        if (b > findMax) {
            findMax = b;
        }
        if (c > findMax) {
            findMax = c;
        }

        return findMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Đây là chương trình tìm số lớn nhất trong 3 số ");
        System.out.println(" Nhập vào số đầu tiên: ");
        int k = Integer.parseInt(sc.nextLine());
        System.out.println(" Nhập vào số tiếp theo: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println(" Nhập vào số cuối cùng: ");
        int n = Integer.parseInt(sc.nextLine());
        int numberMax = findMax(k, m, n);
        System.out.println(" Số lớn nhất trong 3 số đó là: " + numberMax);
    }
}
