/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05076;

/**
 *
 * @author LONGDT
 */
public class ThongKe {
    private String str;
    private MatHang mh;

    public ThongKe() {
    }

    public ThongKe(String str) {
        this.str = str;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }
    
    public String id(){
        String[] s = this.str.split("\\s+");
        return s[0];
    }
    private int nhap(){
        String[] s = this.str.split("\\s+");
        int sln = Integer.parseInt(s[1]);
        int dgn = Integer.parseInt(s[2]);
        int res = sln*dgn;
        return res;
    }
    private int xuat(){
        String[] s = this.str.split("\\s+");
        int slx = Integer.parseInt(s[3]);
        int dgn = Integer.parseInt(s[2]);
        int x = slx*dgn;
        int res=0;
        if(mh.getXl().equals("A")){
            res = x + x*8/100;
        }else if(mh.getXl().equals("B")){
            res = x + x*5/100;
        }if(mh.getXl().equals("C")){
            res = x + x*2/100;
        }
        return res;
    }
    
    @Override
    public String toString(){
        return id() + " " + mh.getName() + " " + nhap() + " " + xuat();
    }
}
