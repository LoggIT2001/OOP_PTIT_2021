/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07010;

import java.util.*;
import java.text.*;
/**
 *
 * @author LONGDT
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private Date ngaySinh;
    private float GPA;
    
    public SinhVien(){
        
    }
    public SinhVien(String maSV, String hoTen, String lop, String ngaySinh, String GPA) throws ParseException{
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.GPA = Float.parseFloat(GPA);
    }
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return maSV + " " + hoTen + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh) + " " + df.format(GPA);
    }
}
