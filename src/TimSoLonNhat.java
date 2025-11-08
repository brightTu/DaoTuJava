void main() {
    int num1;
    int num2;
    int bigger;
    Scanner Nhap = new Scanner(System.in);
    System.out.println("Vui lòng nhập vào số đầu tiên: ");
    num1 = Integer.parseInt(Nhap.nextLine());
    System.out.println("Vui lòng nhập vào số tiếp theo: ");
    num2 = Integer.parseInt(Nhap.nextLine());
    if(num1 > num2){
        bigger = num1;
    }else{
        bigger = num2;
    }
    System.out.println(" Số lớn nhất là: " + bigger);
}
