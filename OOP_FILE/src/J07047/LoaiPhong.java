/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07047;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class LoaiPhong implements Serializable{
    private String kh,ten;
    private double phiphucvu;
    private int dongiangay;
    public LoaiPhong(String s){
        StringTokenizer st = new StringTokenizer(s);
        String word[] = new String [4];
        int d = 0;
        while(st.hasMoreTokens()){
            word[d++] = st.nextToken();
        }
        this.kh = word[0];
        this.ten = word[1];
        this.dongiangay = Integer.parseInt(word[2]);
        this.phiphucvu = Double.parseDouble(word[3]);
    }
    public String getKihieu(){
        return kh;
    }
    public int getDonGiaNgay(){
        return dongiangay;
    }
    public double getPhiPhucVu(){
        return phiphucvu;
    }
    @Override
    public String toString(){
        return kh + " " + ten + " " + dongiangay + " " + phiphucvu;
    }
}
