/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LONGDT
 */
public class XetTuyen {
    private String id,name;
    private Date ns;
    private float lt,th;

    public XetTuyen() {
    }

    public XetTuyen(int id, String name, String ns, String lt, String th) throws ParseException {
        this.id = String.format("PH%02d", id);
        this.name = name.trim();
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.lt = Float.parseFloat(lt);
        this.th = Float.parseFloat(th);
    }
    
    private String ten(){
        String res="";
        String[] s = this.name.toLowerCase().split("\\s+");
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
    private int age(){
        String s = new SimpleDateFormat("dd/MM/yyyy").format(ns);
        String[] tmp = s.split("/");
        int res = 2021 - Integer.parseInt(tmp[2]);
        return res;
    }
    private int diem(){
        float dc = (this.lt + this.th)/2;
        if(this.lt>=8 && this.th >=8){
            dc+=1;
        }else if(this.lt>=7.5 && this.th>=7.5){
            dc+=0.5;
        }else{
            dc+=0;
        }
        int res = (int)(Math.round(dc));
        if(res>10){
            return 10;
        }else{
            return res;
        }
    }
    private String xl(){     
        String res = "Truot";
        if(diem()==9 || diem()==10){
            res = "Xuat sac";
        }
        if(diem()==8){
            res = "Gioi";
        }
        if(diem()==7){
            res = "Kha";
        }
        if(diem()==6 || diem()==5){
            res = "Trung binh";
        }
        return res;
    }
    
    @Override
    public String toString(){
        return id + " " + ten() + String.format("%d %d", age(), diem()) + " " + xl();
    }
}
