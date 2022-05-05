/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05058;

/**
 *
 * @author LONGDT
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maTs, hoTen;
    private double diemToan, diemLy, diemHoa;

    public ThiSinh(String maTs, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maTs = maTs;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    public String getKhuVuc() {
        return maTs.substring(0, 3);
    }
    
    private double tinhDiemUuTien() {
        double tmp = 0;
        if(getKhuVuc().equalsIgnoreCase("KV1")) {
            tmp = 0.5;
        } else if(getKhuVuc().equalsIgnoreCase("KV2")) {
            tmp = 1.0;
        } else {
            tmp = 2.5;
        }
        return tmp;
    }
    
    public double tinhTongDiem() {
        return diemToan*2 + diemLy + diemHoa + tinhDiemUuTien(); 
    }

    public String getMaTs() {
        return maTs;
    }
    
    private String setTrangThai() {
        String res = "";
        if(tinhTongDiem() >= 24) {
            res = "TRUNG TUYEN";
        } else {
            res = "TRUOT";
        }
        return res;
    }
    
    public String inDiem(double diem) {
        String t = Double.toString(diem);
        if(t.charAt(t.length()-1) == '0') {
            return String.format("%.0f", diem);
        } else {
            return String.format("%.1f", diem);
        }
    }
    
    @Override
    public String toString() {
        return maTs + " " + hoTen + " " + inDiem(tinhDiemUuTien()) + " " + inDiem(tinhTongDiem()) + " " + setTrangThai();
    }
    @Override
    public int compareTo(ThiSinh ts) {
        if(this.tinhTongDiem() == ts.tinhTongDiem()) {
            return this.getMaTs().compareToIgnoreCase(ts.getMaTs());
        }
        return this.tinhTongDiem() > ts.tinhTongDiem() ? -1 : 1;
    }
}
