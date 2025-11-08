void main() {
        final double TY_GIA = 23500;
        Scanner Nhap = new Scanner(System.in);
        System.out.print("Nhập số tiền (USD): ");
        double usd = Double.parseDouble(Nhap.nextLine());
        double vnd = usd * TY_GIA;
        System.out.printf("%.2f USD = %, .0f VND\n", usd, vnd);
    }
