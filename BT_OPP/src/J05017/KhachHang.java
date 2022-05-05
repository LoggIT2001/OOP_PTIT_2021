/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05017;

/**
 *
 * @author LONGDT
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma;
    private String name;
    private int csc;
    private int csm;
    
    public KhachHang(){
        
    }
    public KhachHang(String ma, String name, String csc, String csm){
        this.ma = ma;
        this.name = name;
        this.csc = Integer.parseInt(csc);
        this.csm = Integer.parseInt(csm);
    }
    private double tongTien(){
        int x = this.csm - this.csc;
        double res=0;
        if(x>100){
            res = (50*100 + 50*150 + (x-100)*200)*1.05;
        }else if(x>=51){
            res= (50*100 + (x-50)*150)*1.03;
        }else if(x>0){
            res = x*100 + (x*100)*2/100;
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f", ma, name, tongTien());
    }

    @Override
    public int compareTo(KhachHang kh) {
        double x = this.tongTien();
        double y = kh.tongTien();
        if(x>y){
            return 1;
        }else if(x<y){
            return -1;
        }else{
            return 0;
        }
    }
}
