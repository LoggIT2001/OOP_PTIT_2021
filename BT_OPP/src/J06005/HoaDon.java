/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06005;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class HoaDon {
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
    @Override
    public String toString(){
        return id + " " +kh.toString() + " " + mh.toString() + " " + String.format("%d %d", sl, tt());
    }
}
