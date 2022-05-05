import java.util.Scanner;

public class DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int t = 1; t <= n; t++) {
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String ngayKiHopDong = sc.nextLine();
            NhanVienx nvx = new NhanVienx();
            nvx.setHoTen(hoTen);
            nvx.setGioiTinh(gioiTinh);
            nvx.setNgaySinh(ngaySinh);
            nvx.setDiaChi(diaChi);
            nvx.setMaSoThue(maSoThue);
            nvx.setNgayKiHopDong(ngayKiHopDong);
            String a = nvx.getHoTen();
            String b = nvx.getGioiTinh();
            String c = nvx.getNgaySinh();
            String d = nvx.getDiaChi();
            String e = nvx.getMaSoThue();
            String f = nvx.getNgayKiHopDong();
            System.out.println("0000" + t + " " + a + " " + b + " " + c + " " + d + " " + e + " " + f);
        }
        sc.close();
    }
}

class NhanVienx {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;

    public NhanVienx() {

    }

    public NhanVienx(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue,
            String ngayKiHopDong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSoThue() {
        return this.maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getNgayKiHopDong() {
        return this.ngayKiHopDong;
    }

    public void setNgayKiHopDong(String ngayKiHopDong) {
        this.ngayKiHopDong = ngayKiHopDong;
    }
}
