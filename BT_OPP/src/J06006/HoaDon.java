/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06006;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class HoaDon implements Comparable<HoaDon>{
    private String id;
    private KhachHang kh;
    private MatHang mh;
    private int sl;
    
    public HoaDon(){
        
    }

    public HoaDon(String id, KhachHang kh, MatHang mh, String sl) {
        this.id = id;
        this.kh = kh;
        this.mh = mh;
        this.sl = Integer.parseInt(sl);
    }
    public long tt(){
        return mh.getGiaban()*sl;
    }
    public long ln(){
        return (mh.getGiaban() - mh.getGiamua())*sl;
    }
    @Override
    public String toString(){
        return id + " " + kh.toString() + " " + mh.toString() + String.format(" %d %d %d", sl, tt(), ln());
    }

    @Override
    public int compareTo(HoaDon hd) {
        if(this.ln() > hd.ln()){
            return 1;
        }else if(this.ln() < hd.ln()){
            return -1;
        }else{
            if(this.id.compareTo(hd.id)>0){
                return -1;
            }else if(this.id.compareTo(hd.id)<0){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
