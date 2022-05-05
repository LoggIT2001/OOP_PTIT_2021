import java.util.Scanner;

public class KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.ns();
        sv.xuat();
    }
}

class SinhVien {
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float KDA;

    public SinhVien() {

    }

    public SinhVien(String hoTen, String lop, String ngayString, float KDA) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngayString;
        this.KDA = KDA;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.hoTen = sc.nextLine();
        this.lop = sc.next();
        this.ngaySinh = sc.next();
        this.KDA = sc.nextFloat();
        sc.close();
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

    public void xuat() {
        System.out.print("B20DCCN001 " + this.hoTen + " " + this.lop + " ");
        System.out.print(ns() + " ");
        System.out.printf("%.2f", this.KDA);
    }
}