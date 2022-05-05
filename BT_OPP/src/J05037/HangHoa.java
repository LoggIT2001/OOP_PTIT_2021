/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05037;

/**
 *
 * @author LONGDT
 */
public class HangHoa implements Comparable<HangHoa>{
    private String mahang,tenhang,donvitinh;
    private int dongianhap,soluong;
    public HangHoa(int i,String tenhang,String donvitinh,int dongianhap,int soluong){
        this.mahang="MH"+String.format("%02d",i);
        this.tenhang=tenhang;
        this.donvitinh=donvitinh;
        this.dongianhap=dongianhap;
        this.soluong=soluong;
    }
    private int phivanchuyen(){
        return (int)Math.round(this.dongianhap*this.soluong*0.05);
    }
    private int thanhtien(){
        return (int)Math.round(this.dongianhap*this.soluong+phivanchuyen());
    }
    private int giaban(){
        return (((int)Math.round((1.02*thanhtien()/this.soluong))+99)/100)*100;
    }
    @Override 
    public String toString(){
        return mahang+" "+tenhang+" "+donvitinh+" "+phivanchuyen()+" "+thanhtien()+" "+giaban();
    }
    @Override
    public int compareTo(HangHoa o){
        return o.giaban()-this.giaban();
    }
}
