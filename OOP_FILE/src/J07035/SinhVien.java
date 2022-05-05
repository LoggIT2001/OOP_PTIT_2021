/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07035;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class SinhVien {
    private String msv,hoten,lop,email;
    public SinhVien(String msv,String hoten,String lop,String email){
        this.msv = msv;
        this.hoten = chuanhoa(hoten);
        this.lop = lop;
        this.email = email;
    }
    private String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            word = word.toLowerCase();
            sb.append(Character.toUpperCase(word.charAt(0)));
            for(int i=1;i<word.length();i++)
               sb.append(word.charAt(i));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public String Getmsv(){
        return msv;
    }
    public String Hoten(){
        return hoten;
    }
    @Override
    public String toString(){
        return msv + " "+hoten + " "+lop;
    }
}
