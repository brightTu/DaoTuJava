void main() {
        Scanner Nhap = new Scanner(System.in);

        // Nhập tâm C(xC, yC) và bán kính R
        System.out.print("Nhập hoành độ tâm C (xC): ");
        double xC = Double.parseDouble(Nhap.nextLine());
        System.out.print("Nhập tung độ tâm C (yC): ");
        double yC = Double.parseDouble(Nhap.nextLine());
        System.out.print("Nhập bán kính R: ");
        double R = Double.parseDouble(Nhap.nextLine());

        // Nhập tọa độ điểm M(xM, yM)
        System.out.print("Nhập hoành độ điểm M (xM): ");
        double xM = Double.parseDouble(Nhap.nextLine());
        System.out.print("Nhập tung độ điểm M (yM): ");
        double yM = Double.parseDouble(Nhap.nextLine());

        // Tính khoảng cách từ M đến tâm C
        double d = Math.sqrt(Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2));

        // So sánh khoảng cách d với bán kính R
        if (d < R) {
            System.out.println("→ Điểm M nằm **bên trong** đường tròn.");
        } else if (d == R) {
            System.out.println("→ Điểm M nằm **trên** đường tròn.");
        } else {
            System.out.println("→ Điểm M nằm **bên ngoài** đường tròn.");
        }

        Nhap.close();
    }
