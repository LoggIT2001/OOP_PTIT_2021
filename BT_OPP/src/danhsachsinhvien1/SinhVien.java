/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachsinhvien1;

import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author LONGDT
 */
public class SinhVien implements Serializable{
    private String ma, lop, ten;
    private Date ngaysinh;
    private float gpa;
    
    public SinhVien(int ma, String name, String lop, String ngaysinh, float gpa) throws ParseException{
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = name;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
