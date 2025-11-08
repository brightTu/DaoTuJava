void main (){
    final float RATE = 0.015f ;
    float creditCard;
    float payment;
    float balance;
    float penalty = 0;

    Scanner Nhap = new Scanner(System.in);
    System.out.println(" Vui lòng nhập vào số tiền thẻ tín dụng: ");
    creditCard = Float.parseFloat(Nhap.nextLine());
    System.out.println(" Vui lòng nhập vào số tiền đã thanh toán: ");
    payment = Float.parseFloat(Nhap.nextLine());
    balance = creditCard - payment;

    if (balance > 0){
        penalty = balance * RATE;
        System.out.println(" Số tiền bạn chưa thanh toán là: " + balance);
        System.out.println(" Số tiền bạn bị phạt là: " + penalty);
    }else{
        System.out.println(" Bạn không bị phạt");
    }

}