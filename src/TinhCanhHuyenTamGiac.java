void main() {
    int edge1;
    int edge2;
    Scanner nhap = new Scanner(System.in);
    System.out.println("Vui lòng nhập vào cạnh góc vuông 1: ");
    edge1 = Integer.parseInt(nhap.nextLine());
    System.out.println("Vui lòng nhập vào cạnh góc vuông 2: ");
    edge2 = Integer.parseInt(nhap.nextLine());
    double edge3 = Math.sqrt(edge1 * edge1 + edge2 * edge2);
    System.out.println("Chiều dài của cạnh huyền là: "+ edge3 );

    if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1){
        double P = edge1 + edge2 + edge3;
        double p = P/2;
        double S = Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));

        System.out.println(" Đây là tam giác hợp lệ");
        System.out.println(" Chu vi của tam giác là: " + P);
        System.out.println(" Diện tích của tam giác là: " + S);
    }else{
        System.out.println(" Đây là tam giác không hợp lệ");
    }

    /* int edge1;
    int edge2;
    Scanner Input = new Scanner(System.in);
    System.out.println("Hãy nhập vào cạnh góc vuông thứ 1: ");
    edge1 = Integer.parseInt(Input.nextLine());
    System.out.println("Hãy nhập vào cạnh huyền của tam giác: ");
    edge2 = Integer.parseInt(Input.nextLine());
    double edge3 = Math.sqrt(edge2 * edge2 - edge1 * edge1);
    System.out.println(" Độ dài của cạnh góc vuông thứ 2: " + edge3);*/
}
