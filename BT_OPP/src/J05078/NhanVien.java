/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05078;

/**
 *
 * @author LONGDT
 */
public class NhanVien {
    private String maNV, tenNV;
    private int luongCB, soNgayCong;

    public NhanVien(String maNV, String tenNV, int luongCB, int soNgayCong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public long tinhLuong() {
        int heSo = 0;
        char loaiNV = maNV.charAt(0);
        int soNam = (maNV.charAt(1) - '0') * 10 + (maNV.charAt(2) - '0');
        String maPhong = maNV.substring(3, maNV.length());

        switch (loaiNV) {
            case 'A':
                if(soNam >= 1 && soNam <= 3) {
                    heSo = 10;
                } else if(soNam >= 4 && soNam <= 8) {
                    heSo = 12;
                } else if(soNam >= 9 && soNam <= 15) {
                    heSo = 14;
                } else {
                    heSo = 20;
                }
                break;
            case 'B':
                if(soNam >= 1 && soNam <= 3) {
                    heSo = 10;
                } else if(soNam >= 4 && soNam <= 8) {
                    heSo = 11;
                } else if(soNam >= 9 && soNam <= 15) {
                    heSo = 13;
                } else {
                    heSo = 16;
                }
                break;
            case 'C':
                if(soNam >= 1 && soNam <= 3) {
                    heSo = 9;
                } else if(soNam >= 4 && soNam <= 8) {
                    heSo = 10;
                } else if(soNam >= 9 && soNam <= 15) {
                    heSo = 12;
                } else {
                    heSo = 14;
                }
                break;
            default:// case 'D':
                if(soNam >= 1 && soNam <= 3) {
                    heSo = 8;
                } else if(soNam >= 4 && soNam <= 8) {
                    heSo = 9;
                } else if(soNam >= 9 && soNam <= 15) {
                    heSo = 11;
                } else {
                    heSo = 13;
                }
        }
        return luongCB*soNgayCong*heSo*1000;
    }

    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + tinhLuong();
    }
}
