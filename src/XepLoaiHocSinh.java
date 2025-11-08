void main() {
    final float INDEX1 = 5;
    final float INDEX2 = 6.5f;
    final float INDEX3 = 8.5f;
    String nameStudent;
    float pointMath;
    float pointLy;
    float pointHoa;
    float diemTB;
    String hocLuc;

    Scanner Nhap = new Scanner(System.in);
    System.out.println(" Nhập vào tên học sinh: ");
    nameStudent = Nhap.nextLine();
    System.out.println(" Nhập vào điểm môn Toán: ");
    pointMath = Float.parseFloat(Nhap.nextLine());
    System.out.println(" Nhập vào điểm môn Lý: ");
    pointLy = Float.parseFloat(Nhap.nextLine());
    System.out.println(" Nhập vào điểm môn Hóa ");
    pointHoa = Float.parseFloat(Nhap.nextLine());
    diemTB = ( pointMath + pointLy + pointHoa)/3;

    if (diemTB >= INDEX3){
        hocLuc = "GIỎI";
    }else if (diemTB >= INDEX2 && diemTB < INDEX3) {
        hocLuc = "KHÁ";
    }else if (diemTB >= INDEX1 && diemTB < INDEX2) {
        hocLuc = "TRUNG BÌNH";
    }else {
        hocLuc = "YẾU";
    }
    System.out.println("Học sinh " + nameStudent + "\t đạt điểm trung bình là " + diemTB + "\t xếp loại: " + hocLuc );
}