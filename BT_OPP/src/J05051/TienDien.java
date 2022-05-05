/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05051;

/**
 *
 * @author LONGDT
 */
public class TienDien implements Comparable<TienDien> {
    private String MKH;
    private String loaiSD;
    private int csc;
    private int csm;
    
    public TienDien(){
        
    }
    public TienDien(String MKH, String loaiSD, String csc, String csm){
        this.MKH = MKH;
        this.loaiSD = loaiSD;
        this.csc = Integer.parseInt(csc);
        this.csm = Integer.parseInt(csm);
    }
    private int heSo(){
        int t=0;
        if(this.loaiSD.equals("NN")){
            t=5;
        }else if(this.loaiSD.equals("TT")){
            t=4;
        }else if(this.loaiSD.equals("KD")){
            t=3;
        }else if(this.loaiSD.equals("CN")){
            t=2;
        }
        return t;
    }
    private int thanhTien(){
        return (this.csm-this.csc)*heSo()*550;
    }
    private int phuTroi(){
        int x = this.csm - this.csc;
        int res=0;
        if(x<50){
            res=0;
        }else if(x>=50 && x<=100){
            res = (int)(Math.round(thanhTien()*35/100.0));
        }else if(x>100){
            res=thanhTien();
        }
        return res;
    }
    private int tongTien(){
        return (phuTroi()+thanhTien());
    }
    @Override
    public String toString(){
        return String.format("%s %d %d %d %d", this.MKH, this.heSo(), this.thanhTien(), this.phuTroi(), this.tongTien());
    }

    @Override
    public int compareTo(TienDien td) {
       int x=this.tongTien();
       if(x>td.tongTien()){
           return 1;
       }else if(x<td.tongTien()){
           return -1;
       }else{
           return 0;
       }
    }
    
}
