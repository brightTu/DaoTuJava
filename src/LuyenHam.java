import java.util.Scanner;

public class LuyenHam {
    // Tìm số lớn nhất

    /* public static int numMax(int a, int b, int c){
        int soMax = a;
        if(b>a){
            soMax = b;
        }
        if(c>a){
            soMax = c;
        }
        return soMax;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Vui lòng nhập vào số thứ nhất: ");
        int x = Integer.parseInt( sc.nextLine() );
        System.out.println(" Vui lòng nhập vào số thứ hai: ");
        int y = Integer.parseInt(sc.nextLine() );
        System.out.println(" Vui lòng nhập vào số thứ ba: ");
        int z = Integer.parseInt(sc.nextLine() );
        int soLonNhat = numMax(x, y, z);
        System.out.println(" Số lớn nhất trong ba số là: " + soLonNhat);
    }*/

    // tổng 3 số

    /*
    public static int sum3So( int a, int b, int c){
        int tong = a + b + c;
        return tong;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Vui lòng nhập vào số thứ nhất: ");
        int x = Integer.parseInt( sc.nextLine() );
        System.out.println(" Vui lòng nhập vào số thứ hai: ");
        int y = Integer.parseInt(sc.nextLine() );
        System.out.println(" Vui lòng nhập vào số thứ ba: ");
        int z = Integer.parseInt(sc.nextLine() );
        int sum = sum3So(x, y, z);
        System.out.println(" Tổng của 3 số đã nhập vào là: " + sum);
    } */

    // Check số chẵn lẻ
    /*

    public static void soChanLe(int a){
        if(a%2 == 0){
            System.out.println(" là số chẵn ");;
        }else{
            System.out.println(" là số lẻ ");;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hãy nhập vào một số bất kỳ: ");
        int num = Integer.parseInt( sc.nextLine());
        soChanLe(num);
    } */

    public static final int GRAB_CAR_1KM = 8000;
    public static final int GRAB_SUV_1KM = 9000;
    public static final int GRAB_BLACK_1KM = 10000;

    public static final int GRAB_CAR_1TO19 = 7500;
    public static final int GRAB_SUV_1TO19 = 8500;
    public static final int GRAB_BLACK_1TO19 = 9500;

    public static final int GRAB_CAR_UPPER19 = 7000;
    public static final int GRAB_SUV_UPPER19 = 8000;
    public static final int GRAB_BLACK_UPPER19 = 9000;

    public static final int GRAB_CAR_WAIT = 2000;
    public static final int GRAB_SUV_WAIT = 3000;
    public static final int GRAB_BLACK_WAIT = 3500;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int loaiGrab = chonGrab(sc);
        float soKm = nhapSoKm(sc);
        int thoiGianCho = nhapThoiGianCho(sc);
        float tienTra = tinhTienTra(loaiGrab, thoiGianCho, soKm);
        System.out.println("Tiền trả: " + tienTra );
        
    }

    public static float nhapSoKm(Scanner sc) {
        System.out.println("Vui lòng nhập vào số km:");
        float soKm = Float.parseFloat(sc.nextLine());
        return soKm;
    }

    public static int nhapThoiGianCho( Scanner sc){
        System.out.println(" Vui lòng nhập thời gian chờ:");
        int thoiGian = Integer.parseInt(sc.nextLine());
        return thoiGian;
    }

    public static int chonGrab(Scanner sc){
        /*Scanner  sc = new Scanner(System.in);*/
        System.out.println(" Vui lòng chọn loại Grab ");
        System.out.println("1. Grab Car");
        System.out.println("2. Grab Suv");
        System.out.println("3. Grab Black");
        int loai = Integer.parseInt( sc.nextLine());
        return loai;
    }

    public static float tinhTienKMDauTien(int loaiGrab){
        float tien = 0;
        if(loaiGrab == 1){
            tien = GRAB_CAR_1KM;
        }else if(loaiGrab == 2){
            tien = GRAB_SUV_1KM;
        }else if(loaiGrab == 3){
            tien = GRAB_BLACK_1KM;
        }
        return tien;
    }

    public static float tinhTienKM1Den19(float soKM, int loaiGrab){
        float tien = 0;
        if(loaiGrab == 1){
            tien = GRAB_CAR_1KM + (soKM - 1) * GRAB_CAR_1TO19;
        }else if(loaiGrab == 2){
            tien = GRAB_SUV_1KM +  (soKM - 1) * GRAB_SUV_1TO19;
        }else if(loaiGrab == 3){
            tien = GRAB_BLACK_1KM + (soKM - 1) * GRAB_BLACK_1TO19;
        }
        return tien;
    }

    public static float tinhTienKMTren19( float soKM, int loaiGrab){
        float tien = 0;
        if(loaiGrab == 1){
            tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO19 + (soKM - 19) * GRAB_CAR_UPPER19;
        }else if(loaiGrab == 2){
            tien = GRAB_SUV_1KM + 18 * GRAB_SUV_UPPER19 + (soKM - 19) * GRAB_SUV_UPPER19;
        }else if(loaiGrab == 3){
            tien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_UPPER19 + (soKM - 19) * GRAB_BLACK_UPPER19;
        }
        return tien;
    }

    public static float tinhTienCho( int loaiGrab, int thoiGianCho ){
        float tien = 0;
        if(thoiGianCho >= 3){
            int soLanTinh = Math.round((thoiGianCho * 1.0f)/3) ;
            if(loaiGrab == 1){
                tien = soLanTinh * GRAB_CAR_WAIT;
            }else if(loaiGrab == 2){
                tien = soLanTinh * GRAB_SUV_WAIT;
            }else {
                tien = soLanTinh * GRAB_BLACK_WAIT;
            }
        }
        return tien;
    }

    public static float tinhTienTra(int loaiGrab,  int thoiGianCho, float soKM){
        float tienTra = 0;
        if(soKM <= 1){
            tienTra = tinhTienKMDauTien(loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
        }else if(soKM > 1 && soKM <= 19){
            tienTra = tinhTienKM1Den19(soKM, loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
        }else {
            tienTra = tinhTienKMTren19(soKM, loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
        }
        return tienTra;
    }


}
