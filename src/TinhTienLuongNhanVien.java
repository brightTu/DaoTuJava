void main() {
    final float RATE = 1.5f;
    final int STANDARD_HOUR = 40;
    String nameStaff;
    float hour;
    float money;
    float payment;

    Scanner Nhap = new Scanner(System.in);
    System.out.println("Vui lòng nhập vào tên nhân viên: ");
    nameStaff = Nhap.nextLine();
    System.out.println("Nhập vào số giờ nhân viên đã làm việc: ");
    hour = Float.parseFloat(Nhap.nextLine());
    System.out.println("Nhập vào số tiền được nhận trong 1 giờ: ");
    money = Float.parseFloat(Nhap.nextLine());

    if (hour > STANDARD_HOUR){
        payment = STANDARD_HOUR * money + (hour - STANDARD_HOUR) * money * RATE;
    }else {
        payment = hour * money;
    }
    System.out.println(" Số tiền nhân viên " + nameStaff + " nhận được là: " + payment);

}
