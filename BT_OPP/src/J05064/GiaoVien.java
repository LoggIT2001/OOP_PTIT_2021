/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05064;

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
        this.ma=ma;
        this.name=name;
        this.lcb = Integer.parseInt(lcb);
    }
    private int bacLuong(){
        char[] c = this.ma.toCharArray();
        String res="";
        res+=String.valueOf(c[2])+String.valueOf(c[3]);
        return Integer.parseInt(res);
    }
    private int phuCap(){
        char[] c = this.ma.toCharArray();
        String res="";
        res+=String.valueOf(c[0])+String.valueOf(c[1]);
        int pc=0;
        if(res.equals("HT")){
            pc=2000000;
        }else if(res.equals("HP")){
            pc=900000;
        }else if(res.equals("GV")){
            pc=500000;
        }
        return pc;
    }
    private int thuNhap(){
        return (this.lcb * bacLuong() + phuCap());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", ma, name, bacLuong(), phuCap(), thuNhap());
    }
}
