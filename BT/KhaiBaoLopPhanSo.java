import java.util.Scanner;

public class KhaiBaoLopPhanSo {
    public static void main(String[] args) {
        PhanSo p = new PhanSo(1, 1);
        p.nhap();
        p.rutGon();
        System.out.println(p);
    }
}

class PhanSo {
    private long tuso;
    private long mauso;

    public PhanSo() {

    };

    public PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.tuso = sc.nextLong();
        this.mauso = sc.nextLong();
        sc.close();
    }

    private long GCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public void rutGon() {
        long tmp = GCD(this.tuso, this.mauso);
        this.tuso = this.tuso / tmp;
        this.mauso = this.mauso / tmp;
    }

    @Override
    public String toString() {
        return this.tuso + "/" + this.mauso;
    }
}
