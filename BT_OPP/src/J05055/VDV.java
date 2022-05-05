/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05055;

import java.text.ParseException;

/**
 *
 * @author LONGDT
 */
public class VDV {
    private int id,xh = 0;
    private String name,timestart,timefinish,timeht,timeplus,timecple;
    private String ngaysinh;
    
    public VDV(int id, String name, String ngaysinh,String timestart,String timefinish) throws ParseException {
        this.id = id;
        this.name = name;
        this.timestart = timestart;
        this.timefinish = timefinish;
        this.ngaysinh = ngaysinh;
        this.timeht = timecomplete(this.timestart, this.timefinish);
        this.timeplus = timeuutien();
        this.timecple = timecomplete(timeplus, timeht);
    }
    
    public void setXh(int xh) {
        this.xh = xh;
    }

    public String getTimecple() {
        return timecple;
    }
    
    private  String timeuutien(){
        String[] K = ngaysinh.split("/");
        int n = 0;
        for (int i = 0; i < K[2].length(); i++) {
            n = n*10 + (int)(K[2].charAt(i)-'0');
        }
        if(2021 - n >= 32) return "00:00:03";
        else if(2021 - n >= 25) return "00:00:02";
        else if(2021 - n >= 18) return "00:00:01";
        else return "00:00:00";
    }
    private String timecomplete(String s1,String s2){
        long st = doigio(s1);
        long fn = doigio(s2);
        long cl = fn - st;
        String timecl = "";
        long gio=0,phut=0,giay=0;
        while (cl >= 3600) {            
            gio++;
            cl -= 3600;
        }
        while (cl >= 60) {            
            phut++;
            cl -= 60;
        }
        while (phut >= 60) {            
            gio++;
            phut -= 60;
        }
        giay = cl;
        timecl = timecl + String.format("%02d", gio) + ":" + String.format("%02d", phut) +":" + String.format("%02d", giay);
        return timecl;
    }
    private long doigio(String s){
        String[] K = s.split(":");
        long gio,phut,giay;
        gio = (long)(K[0].charAt(0) - '0')*10 + (long)(K[0].charAt(1) - '0');
        phut = (long)(K[1].charAt(0) - '0')*10 + (long)(K[1].charAt(1) - '0');
        giay = (long)(K[2].charAt(0) - '0')*10 + (long)(K[2].charAt(1) - '0') + phut*60 + gio*3600;
        return giay;
    }

    @Override
    public String toString() {
        return "VDV"  + String.format("%02d", id) + " " + name + " " + timeht + " " + timeplus + " " + timecple + " " + xh;
    }
}
