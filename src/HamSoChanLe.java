import java.util.Scanner;

public class HamSoChanLe {
    public static boolean checkChanLe( int a){
        boolean kQua;
        if(a%2==0){
            kQua = true;
        }else{
            kQua = false;
        }
        return kQua;
    }

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hãy nhập vào một số bất kỳ: ");
        int num = Integer.parseInt( sc.nextLine());
        boolean kq = checkChanLe(num);
        if (kq){
            System.out.println(" là số chẵn");
        }else{
            System.out.println(" là số lẻ");
        }
    }
}
