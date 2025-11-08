void main(String[] args) {
        final int SO_LUONG = 5;
        int tong = 0;
        Scanner Nhap = new Scanner(System.in);
        System.out.println("Nhập " + SO_LUONG + " số nguyên:");

        for (int i = 1; i <= SO_LUONG; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int so = Integer.parseInt(Nhap.nextLine());
            tong += so; // cộng dồn giá trị
        }
        // Tính trung bình (ép kiểu để tránh chia nguyên)
        double trungBinh = (double) tong / SO_LUONG;
        System.out.println("Giá trị trung bình là: " + trungBinh);
    }
