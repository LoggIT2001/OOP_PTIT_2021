/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05043;

/**
 *
 * @author LONGDT
 */
public class NhanVien {
    private String MNV;
    private String name;
    private String CV;
    private int LCB;
    private int NC;
    
    public NhanVien(){
        
    }
    public NhanVien(String MNV, String name, String CV, String LCB, String NC){
        this.MNV = MNV;
        this.name = name;
        this.CV = CV;
        this.LCB = Integer.parseInt(LCB);
        this.NC = Integer.parseInt(NC);
    }
    private int phuCap(){
        String x = this.CV;
        int res=0;
        if(x.equals("GD")){
            res=500;
        }else if(x.equals("PGD")){
            res=400;
        }else if(x.equals("TP")){
            res=300;
        }else if(x.equals("KT")){
            res=250;
        }else{
            res=100;
        }
        return res;
    }
    private int luongChinh(){
        return this.LCB*this.NC;
    }
    private int tamUng(){
        int res=0;
        float x = (this.phuCap() + this.luongChinh())*2/3;
        int tmp = (int)(Math.round(x/1000)*1000);
        if(tmp<25000){
            res=tmp;
        }else{
            res=25000;
        }
        return res;
    }
    private int conLai(){
        return (this.luongChinh()-this.tamUng()+this.phuCap());
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d %d", MNV, name, phuCap(), luongChinh(), tamUng(), conLai());
    }
}
