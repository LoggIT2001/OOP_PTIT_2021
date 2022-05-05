/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05044;

/**
 *
 * @author LONGDT
 */
public class NhanVien {
    private String MNV;
    private String name;
    private String cv;
    private int lcb;
    private int nc;
    
    public NhanVien(){
        
    }
    public NhanVien(String MNV, String name, String cv, String lcb, String nc){
        this.MNV = MNV;
        this.name = name;
        this.cv = cv;
        this.lcb = Integer.parseInt(lcb);
        this.nc = Integer.parseInt(nc);
    }
    public String getChucVu(){
        return this.cv;
    }
    private int phuCap(){
        int res=0;
        if(this.cv.equals("GD")){
            res=500;
        }else if(this.cv.equals("PGD")){
            res=400;
        }else if(this.cv.equals("TP")){
            res=300;
        }else if(this.cv.equals("KT")){
            res=250;
        }else{
            res=100;
        }
        return res;
    }
    private int luongChinh(){
        return (this.lcb * this.nc);
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
