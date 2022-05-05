/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07018;

import java.util.*;
import java.text.*;
/**
 *
 * @author LONGDT
 */
public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private Date ns;
    private float gpa;
    
    public SinhVien(){
        
    }
    public SinhVien(String id, String name, String lop, String ns, String gpa) throws ParseException{
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.ns=new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.gpa=Float.parseFloat(gpa);
    }
    private String ten(){
        String[] s = this.name.toLowerCase().split("\\s+");
        String res="";
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                char[] c = s[i].toCharArray();
                c[0]= Character.toUpperCase(c[0]);
                res += String.valueOf(c) + " ";
            }
        }
        return res;
    }
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return id + " " + ten() + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ns) + " " + df.format(gpa);
    }
}
