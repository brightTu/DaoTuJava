void main() {
        // Tỷ giá cố định
        final double TY_GIA = 23500;

        // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner Nhap = new Scanner(System.in);

        // Nhập số USD
        System.out.print("Nhập số tiền (USD): ");
        double usd = Double.parseDouble(Nhap.nextLine());

        // Tính ra số tiền VND
        double vnd = usd * TY_GIA;

        // Xuất kết quả
        System.out.printf("%.2f USD = %, .0f VND\n", usd, vnd);

        // Đóng Scanner
        Nhap.close();
    }

