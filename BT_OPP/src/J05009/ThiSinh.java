/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05009;

/**
 *
 * @author LONGDT
 */
public class ThiSinh {
    private int maTs;
    private String hoTen, ngaySinh;
    private double diem1, diem2, diem3, tongDiem;

    public ThiSinh(int ma, String hoTen, String ngaySinh, double diem1, double diem2, double diem3) {
        this.maTs = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = tinhTongDiem();
    }
    
    private double tinhTongDiem() {
        return diem1 + diem2 + diem3;
    }

    public int getMaTs() {
        return maTs;
    }

    public double getTongDiem() {
        return tongDiem;
    }
    
    @Override
    public String toString() {
        return maTs + " " + hoTen + " " + ngaySinh + " " + tongDiem;
    }
}
