import java.util.Scanner;

public class HamTongBaSo {
    public static float tong3So(float a, float b, float c){
        float tong = a + b + c;
        return tong;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Chương trình gọi hàm tính tổng 3 số");
        System.out.println(" Hãy nhập vào số thứ nhất: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println(" Hãy nhập vào số thứ hai: ");
        float b =  Float.parseFloat(sc.nextLine());
        System.out.println(" Hãy nhập vào sô thứ ba: ");
        float c = Float.parseFloat(sc.nextLine());
        float kq =  tong3So(a, b, c);
        System.out.println(" Tổng của ba số là: " + kq);
    }
}
