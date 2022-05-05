/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

/**
 *
 * @author LONGDT
 */
public class SinhVien {
    private String maSv, hoTen, lop, email;

    public SinhVien(String maSv, String hoTen, String lop, String email) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getNganh() {
        String tmp = maSv.substring(5, 7);
        return tmp;
    }
    
    public String getMaSv() {
        return maSv;
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString() {
        return maSv + " " + hoTen + " " + lop + " " + email;
    }
}
