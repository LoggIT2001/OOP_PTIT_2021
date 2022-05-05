/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05053;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Donhang implements Serializable,Comparable<Donhang>{
    private String ten,ma;
    private int dongia,soluong;
    public Donhang(String ten,String ma,int dongia,int soluong){
        this.ten = ten;
        
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    
    private String madonhang(){
        return this.ma.substring(1,4);
    }
    private int loai(){
        return Integer.parseInt(this.ma.substring(4,5));
    }
    private int giamgia(){
        int giamgia = 0;
        if(loai()==1) giamgia = (this.soluong*this.dongia)/2;
        else giamgia = (this.soluong*this.dongia*30)/100;
        return giamgia;
    }
    private int thanhtien(){
        return this.soluong*this.dongia - giamgia();
    }
    @Override
    public String toString(){
        return ten+" "+ma+" "+madonhang()+" "+giamgia()+" "+thanhtien();
    }
    @Override
    public int compareTo(Donhang o){
        return this.madonhang().compareTo(o.madonhang());
    }
}