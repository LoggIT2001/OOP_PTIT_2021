import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        ThiSinh t = new ThiSinh();
        t.nhap();
        t.tongDiem();
        t.xuat();
    }
}

class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private float diem1;
    private float diem2;
    private float diem3;

    public ThiSinh() {

    }

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        ngaySinh = sc.next();
        diem1 = sc.nextFloat();
        diem2 = sc.nextFloat();
        diem3 = sc.nextFloat();
        sc.close();
    }

    public float tongDiem() {
        float sum = diem1 + diem2 + diem3;
        return sum;
    }

    public void xuat() {
        System.out.print(this.hoTen + " " + this.ngaySinh + " ");
        System.out.printf("%.1f", tongDiem());
    }
}