import java.util.Scanner;

public class TongPhanSo {
    public static void main(String[] args) {
        PhanSo1 p = new PhanSo1();
        p.nhap();
        p.sum();
    }
}

class PhanSo1 {
    private long tuso1;
    private long mauso1;
    private long tuso2;
    private long mauso2;

    public PhanSo1() {

    }

    public PhanSo1(long tuso1, long mauso1, long tuso2, long mauso2) {
        this.tuso1 = tuso1;
        this.mauso1 = mauso1;
        this.tuso2 = tuso2;
        this.mauso2 = mauso2;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.tuso1 = sc.nextLong();
        this.mauso1 = sc.nextLong();
        this.tuso2 = sc.nextLong();
        this.mauso2 = sc.nextLong();
        sc.close();
    }

    public long GCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public void sum() {
        long x = this.tuso1 * this.mauso2 + this.tuso2 * this.mauso1;
        long y = this.mauso1 * this.mauso2;
        long temp = GCD(x, y);
        x = x / temp;
        y = y / temp;
        System.out.println(x + "/" + y);
    }
}