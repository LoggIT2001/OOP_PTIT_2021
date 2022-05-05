/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05068;

/**
 *
 * @author LONGDT
 */
public class DonHang implements Comparable<DonHang>{
    private String ma;
    private int sl;
    
    public DonHang(){
        
    }
    public DonHang(String s){
        String[] tmp = s.split("\\s+");
        this.ma = tmp[0];
        this.sl = Integer.parseInt(tmp[1]);
    }
    private String HSX(){
        char[] c = this.ma.toCharArray();
        String res="";
        res=String.valueOf(c[c.length-2])+String.valueOf(c[c.length-1]);
        String x="";
        if(res.equals("BP")){
            x="British Petro";
        }else if(res.equals("ES")){
            x="Esso";
        }else if(res.equals("SH")){
            x="Shell";
        }else if(res.equals("CA")){
            x="Castrol";
        }else if(res.equals("MO")){
            x="Mobil";
        }else if(res.equals("TN")){
            x="Trong Nuoc";
        }
        return x;  
    }
    private long donGia(){
        char[] c = this.ma.toCharArray();
        long res=0;
        if(c[0]=='X'){
            res=128000;
        }else if(c[0]=='D'){
            res=11200;
        }else if(c[0]=='N'){
            res=9700;
        }
        return res;
    }
    private double thue(){
        char[] c = this.ma.toCharArray();
        String tmp="";
        tmp=String.valueOf(c[c.length-2])+String.valueOf(c[c.length-1]);
        String mh="";
        mh=String.valueOf(c[0]);
        double res=0,th=0;
        th= this.donGia() * this.sl;
        if(tmp.equals("TN")){
            res=0;
        }else{
            if(mh.equals("X")){
                res=th*3/100;
            }else if(mh.equals("D")){
                res=th*35/1000;
            }else if(mh.equals("N")){
                res=th*2/100;
            }
        }
        return res;
    }
    private double thanhTien(){
        return (this.donGia() * this.sl + this.thue());
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %.0f %.0f", ma, HSX(), donGia(), thue(), thanhTien());
    }

    @Override
    public int compareTo(DonHang dh) {
        double x = this.thanhTien();
        if(x>dh.thanhTien()){
            return 1;
        }else if(x<dh.thanhTien()){
            return -1;
        }else{
            return 0;
        }
    }
}
