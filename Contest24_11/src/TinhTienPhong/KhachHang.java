/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LONGDT
 */
public class KhachHang implements Comparable<KhachHang>{
    private String name,sp,id;
    private Date nhan,tra;
    private int dv,ngay;

    public KhachHang() {
    }

    public KhachHang(int id, String name, String sp, String nhan, String tra, String dv) throws ParseException {
        this.id = String.format("KH%02d", id);
        this.name = name.trim();
        this.sp = sp.trim();
        this.nhan = new SimpleDateFormat("dd/MM/yyyy").parse(nhan);
        this.tra = new SimpleDateFormat("dd/MM/yyyy").parse(tra);
        this.dv = Integer.parseInt(dv);
        ngay = (int)((this.tra.getTime() - this.nhan.getTime())/(1000*60*60*24));
    }
    private String ten(){
        String[] s = this.name.toLowerCase().split("\\s+");
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
    private int time(){
        return ngay+1;
    }
    private int tt(){
        char[] c = sp.toCharArray();
        int res=0;
        if(c[0]=='1'){
            res = 25*time();
        }else if(c[0]=='2'){
            res = 34*time();
        }else if(c[0]=='3'){
            res = 50*time();
        }else if(c[0]=='4'){
            res = 80*time();
        }
        return res+this.dv;
    }
    @Override
    public String toString(){
        return id + " " + ten() + sp + " " +String.format("%d %d", time(), tt());
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.tt()>o.tt()){
            return 1;
        }else if(this.tt()<o.tt()){
            return -1;
        }else{
            return 0;
        }
    }
}
