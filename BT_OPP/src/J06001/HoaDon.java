/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06001;

/**
 *
 * @author LONGDT
 */
public class HoaDon {
    private int stt;
    private String s;
    private SanPham sp;
    
    public HoaDon(){
        
    }
    public HoaDon(int stt, String s){
        this.stt = stt;
        this.s = s;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public String id(){
        String[] tmp = s.split("\\s+");
        char[] c = tmp[0].toCharArray();
        String res = "";
        res = String.valueOf(c[0]) + String.valueOf(c[1]);
        return res;
    }
    public String ma(){
        String[] tmp = s.split("\\s+");
        return tmp[0];
    }
    public int loai(){
        String[] tmp = s.split("\\s+");
        char[] c = tmp[0].toCharArray();
        String res = "";
        res = String.valueOf(c[2]);
        return Integer.parseInt(res);
    }
    public int num(){
        String[] tmp = s.split("\\s+");        
        String res = "";
        res = tmp[1];
        return Integer.parseInt(res);
    }
    public long tt(){
        long res=0;
        if(loai()==1){
            res = num() * sp.getDg1();
        }else if(loai()==2){
            res = num() * sp.getDg2();
        }
        return res;
    }
    public long giamgia(){
        long res=0;
        if(num()>=150){
            res = tt()*50/100;
        }else if(num()>=100){
            res = tt()*30/100;
        }else if(num()>=50){
            res = tt()*15/100;
        }
        return res;
    }
    public long phaitra(){
        return tt() - giamgia();
    }
    @Override
    public String toString(){
        return ma() + "-" + String.format("%03d", stt) + " " + sp.getName() + String.format(" %d %d", giamgia(), phaitra());
    }
}
