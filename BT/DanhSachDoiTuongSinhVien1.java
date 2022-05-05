import java.util.Scanner;

public class DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            SinhVien1 sv = new SinhVien1();
            sv.input(sc);
            sv.ns();
            String tmp = "";
            if (0 < t && t < 10) {
                tmp = "0" + "0" + String.valueOf(t);
            } else if (10 <= t && t <= 99) {
                tmp = "0" + String.valueOf(t);
            }
            System.out.print("B20DCCN" + tmp + " ");
            sv.output();
        }
        sc.close();
    }
}

class SinhVien1 {
    private String ten;
    private String lop;
    private String ngaySinh;
    private float gpa;

    public SinhVien1() {

    }

    public SinhVien1(String name, String lop, String ngaySinh, float gpa) {
        this.ten = name;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public void input(Scanner sc) {
        this.ten = sc.nextLine();
        this.lop = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.gpa = sc.nextFloat();
    }

    public String ns() {
        int x = 0;
        String d = "";
        for (int i = 0; i < ngaySinh.length(); i++) {
            if (ngaySinh.charAt(i) == '/') {
                x = i;
                break;
            } else {
                d += String.valueOf(ngaySinh.charAt(i));
            }
        }
        String m = "";
        int y = 0;
        for (int i = x + 1; i < ngaySinh.length(); i++) {
            if (ngaySinh.charAt(i) == '/') {
                y = i;
                break;
            } else {
                m += String.valueOf(ngaySinh.charAt(i));
            }
        }
        String tmp = "";
        if (d.length() < 2) {
            tmp += "0";
            for (int i = 0; i < d.length(); i++) {
                tmp += String.valueOf(d.charAt(i));
            }
        } else {
            for (int i = 0; i < d.length(); i++) {
                tmp += String.valueOf(d.charAt(i));
            }
        }
        tmp += "/";
        if (m.length() < 2) {
            tmp += "0";
            for (int i = 0; i < m.length(); i++) {
                tmp += String.valueOf(m.charAt(i));
            }
        } else {
            for (int i = 0; i < m.length(); i++) {
                tmp += String.valueOf(m.charAt(i));
            }
        }
        tmp += "/";
        for (int i = y + 1; i < ngaySinh.length(); i++) {
            tmp += String.valueOf(ngaySinh.charAt(i));
        }
        return tmp;
    }

    public void output() {
        System.out.print(this.ten + " " + this.lop + " " + ns() + " ");
        System.out.printf("%.2f", gpa);
    }
}
