void main() {
    final float INDEX1 = 0.12f;
    final float INDEX2 = 0.08f;
    String tenHang;
    int soLuong;
    int giaTien;
    float payment;

    Scanner Nhap = new Scanner(System.in);
    System.out.println(" Nhập mặt hàng là: ");
    tenHang = Nhap.nextLine();
    System.out.println(" Số lượng mặt hàng đó là: ");
    soLuong = Integer.parseInt(Nhap.nextLine());
    System.out.println(" Giá tiền cho mỗi mặt hàng là: ");
    giaTien = Integer.parseInt(Nhap.nextLine());

    if (soLuong >= 100) {
        payment = soLuong * giaTien * (1 -INDEX1);
    } else {
        if (soLuong > 50 && soLuong < 100) {
            payment = soLuong * giaTien * (1 -INDEX2);
        } else {
            payment = soLuong * giaTien;
        }
    }
    System.out.println(" Tên mặt hàng: " + tenHang);
    System.out.println(" Tiền chi cho mặt hàng là: " + payment);
}