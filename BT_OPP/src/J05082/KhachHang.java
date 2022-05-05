/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class KhachHang implements Comparable<KhachHang>{
    private String id, name, gt, dc;
    private Date d;

    public KhachHang() {
    }

    public KhachHang(int id, String name, String gt, String da, String dc) throws ParseException {
        this.id = String.format("KH%03d", id);
        this.name = name.trim();
        this.gt = gt;
        this.d = new SimpleDateFormat("dd/MM/yyyy").parse(da);
        this.dc = dc;
    }
    
    public String ten(){
        String[] s = name.toLowerCase().split("\\s+");
        String res="";
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                char[] c = s[i].toCharArray();
                if(c[0]>='a' && c[0]<='z'){
                    c[0]-=32;
                }
                res+=String.valueOf(c) + " ";
            }
        }
        return res;
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.d.compareTo(o.d)<0){
            return 1;
        }else if(this.d.compareTo(o.d)>0){
            return -1;
        }else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return id + " " + this.ten() + gt + " " + dc + " " + new SimpleDateFormat("dd/MM/yyyy").format(d);
    }
}
