/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07047;

import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author LONGDT
 */
public class KhachHang implements Serializable,Comparable<KhachHang>{
    private String mkh,hoten,maphong,ngayden,ngaydi;
    private long luutru;
    private double tongtien;
    public KhachHang(int i,String hoten,String maphong,String ngayden,String ngaydi) throws ParseException{
        this.mkh = "KH" + String.format("%02d",i);
        this.hoten = hoten;
        this.maphong = maphong;
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").format(date1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").format(date2);
        if(this.ngayden.equals(this.ngaydi)) this.luutru = 0;
        else{
            long diff = date2.getTime() - date1.getTime();
            this.luutru = (diff)/86400000;
        }
    }
    public String getMaphong(){
        return maphong.substring(2,3);
    }
    public long getLuutru(){
        return luutru;
    }
    public void setTongtien(double tongtien){
        this.tongtien = tongtien;
    }
    @Override
    public String toString(){
        return mkh + " " + hoten + " " + maphong + " " + luutru+" "+String.format("%.2f",tongtien);
    }
    @Override
    public int compareTo(KhachHang o){
        if(o.luutru>this.luutru) return 1;
        else if(o.luutru<this.luutru) return -1;
        else return 0;
    }
}
