import java.util.Scanner;

public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.nhap();
        nv.xuat();
    }
}

class NhanVien {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;

    public NhanVien() {

    }

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue,
            String ngayKiHopDong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.hoTen = sc.nextLine();
        this.gioiTinh = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.diaChi = sc.nextLine();
        this.maSoThue = sc.nextLine();
        this.ngayKiHopDong = sc.nextLine();
        sc.close();
    }

    public void xuat() {
        System.out.print("00001 " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh + " ");
        System.out.print(this.diaChi + " " + this.maSoThue + " " + this.ngayKiHopDong);
    }

}
