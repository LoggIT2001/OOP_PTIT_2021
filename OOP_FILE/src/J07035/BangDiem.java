/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07035;

/**
 *
 * @author LONGDT
 */
public class BangDiem implements Comparable<BangDiem>{
    private String msv,mamh;
    private double diem;
    public BangDiem(String msv,String mamh,double diem){
        this.msv = msv;
        this.mamh = mamh;
        this.diem = diem;
    }
    public String Getmsv(){
        return msv;
    }
    public String Getmamh(){
        return mamh;
    }
    public double diem(){
        return diem;
    }
    @Override
    public int compareTo(BangDiem o){
        if(o.diem>this.diem) return 1;
        else if(o.diem<this.diem) return -1;
        else return this.msv.compareTo(o.msv);
    }
}
