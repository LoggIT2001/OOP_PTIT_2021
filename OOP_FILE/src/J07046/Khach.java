/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author LONGDT
 */
public class Khach implements Comparable<Khach>{
    private String maK, ten, maP;
    private Date den, di;
    private int ngay;
 
    public Khach(int maK, String ten, String maP, String den, String di) throws ParseException {
        this.maK = String.format("KH%02d", maK);
        this.ten = ten;
        this.maP = maP;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
        ngay = (int)((this.di.getTime() - this.den.getTime())/(1000*60*60*24));
    }
 
    @Override
    public int compareTo(Khach o) {
        if(this.ngay>o.ngay) return -1;
        else return 1;
    }
 
    @Override
    public String toString() {
        return String.format("%s %s %s %d", maK, ten, maP, ngay);
    }
}
