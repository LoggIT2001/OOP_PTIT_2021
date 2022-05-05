/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05045;

/**
 *
 * @author LONGDT
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ten,chucvu,ma;
    private long lcb,snc,phucap,tamung,conlai,luongChinh;
    
    public NhanVien(int n,String ten,String chucvu,long lcb,long snc){
        this.ten = ten;
        this.chucvu=chucvu;
        this.ma = "NV"+String.format("%02d", n);
        this.lcb = lcb;
        this.snc = snc;
        this.luongChinh = lcb*snc+PhuCap(chucvu);
        this.phucap = PhuCap(chucvu);
        this.tamung =TamUng(chucvu,lcb,snc);
        this.conlai = luongChinh - tamung;
    }
    
    private long PhuCap(String chucvu){
        if(chucvu.compareTo("GD") == 0) return 500;
        else if(chucvu.compareTo("PGD")==0) return 400;
        else if(chucvu.compareTo("TP")==0) return 300;
        else if(chucvu.compareTo("KT")==0) return 250;
        else return 100;
    }
    
    private long TamUng(String chucvu ,long lcb,long snc){
        double n = (PhuCap(chucvu)+lcb*snc)*2/3;
        if(n < (double) 25000){
            return(long) Math.round(n/1000)*1000;
        }else {
            return 25000;
        }    
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+phucap+" "+(lcb*snc)+" "+(tamung)+" "+conlai;
    }
    
    @Override
    public int compareTo(NhanVien o){
        if(this.luongChinh == o.luongChinh){
            if(this.ma.compareTo(o.ma)>0) return 1;
            else if(this.ma.compareTo(o.ma)<0) return -1;
            return 0;
        }else if(this.luongChinh < o.luongChinh) return 1;
        else return -1;
    }
}
