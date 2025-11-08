void main() {
    final double INTEREST = 0.1 ;
    String tenPhim;
    int soVeLon;
    int soVeNho;
    int giaVeLon;
    int giaVeNho;

    Scanner Nhap = new Scanner(System.in);
    System.out.println("Bạn vui lòng nhập vào tên bộ phim: ");
    tenPhim = Nhap.nextLine();
    System.out.println("Bạn vui lòng nhập số lượng vé người lớn: ");
    soVeLon = Integer.parseInt(Nhap.nextLine());
    System.out.println(" Bạn vui lòng nhập số lượng vé trẻ em: ");
    soVeNho = Integer.parseInt(Nhap.nextLine());
    System.out.println(" Bạn vui lòng nhập giá vé người lớn: ");
    giaVeLon = Integer.parseInt(Nhap.nextLine());
    System.out.println(" Bạn vui lòng nhập giá vé trẻ em: ");
    giaVeNho = Integer.parseInt(Nhap.nextLine());

    double tongThu = soVeLon * giaVeLon + soVeNho * giaVeNho;
    double tuThien = tongThu * INTEREST;
    double conLai = tongThu - tuThien;
    System.out.println("Tên phim: " + tenPhim);
    System.out.println("Số tiền thu được là: " + tongThu);
    System.out.println("Số tiền từ thiện là: " + tuThien);
    System.out.println("Số tiền còn lại là: " + conLai);
}
