/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05029;

/**
 *
 * @author LONGDT
 */
public class DoanhNghiep {
    private String maDN, tenDN;
    private int soSV;

    public DoanhNghiep(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    public String getMaDN() {
        return maDN;
    }

    public int getSoSV() {
        return soSV;
    }

    @Override
    public String toString() {
        return maDN + " " + tenDN + " " + soSV;
    }
}
