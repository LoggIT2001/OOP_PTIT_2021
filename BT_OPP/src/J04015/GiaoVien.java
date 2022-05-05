/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015;

/**
 *
 * @author LONGDT
 */
public class GiaoVien {
    private String ma;
    private String name;
    private int lcb;
    
    public GiaoVien(){
        
    }
    public GiaoVien(String ma, String name, String lcb){
        this.ma = ma;
        this.name = name;
        this.lcb = Integer.parseInt(lcb);
    }
    private int bacLuong(){
        char[] c = this.ma.toCharArray();
        String tmp="";
        tmp=String.valueOf(c[2])+String.valueOf(c[3]);
        int res= Integer.parseInt(tmp);
        return res;
    }
    private int phuCap(){
        char[] c = this.ma.toCharArray();
        String tmp="";
        tmp=String.valueOf(c[0])+String.valueOf(c[1]);
        int res=0;
        if(tmp.equals("HT")){
            res=2000000;
        }else if(tmp.equals("HP")){
            res=900000;
        }else if(tmp.equals("GV")){
            res=500000;
        }
        return res;
    }
    private int thuNhap(){
        return (this.lcb*this.bacLuong()+this.phuCap());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", ma, name, bacLuong(), phuCap(), thuNhap());
    }
}
